package com.omnicirus.services;

import com.omnicirus.domain.ItemDomain;
import com.omnicirus.domain.OrderDomain;
import com.omnicirus.models.Cart;
import com.omnicirus.models.Order;
import com.omnicirus.models.Product;
import com.omnicirus.repository.CartRepository;
import com.omnicirus.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductService productService;

    @Autowired
    CartService cartService;

    @Autowired
    CartRepository cartRepository;

    public Order addItemsToCart(OrderDomain order) throws Exception {

        return saveOrderDetails(order);
    }

    private Order saveOrderDetails(OrderDomain order) throws Exception {
        Set<ItemDomain> itemDomains = order.getItemDomain();

        Set<Cart> carts = new HashSet<>();

        ArrayList<Double> totals = new ArrayList<>();

        itemDomains.forEach(item -> {
            int reqdQuantity = item.getReqdQuantity();

            Product product = productService.getProduct(item.getProductId());

            int availableQuantity = product.getAvailableQuantity();
            if (reqdQuantity <= availableQuantity) {
                Cart cart = new Cart();
                cart.setProduct(product);
                cart.setReqdQuantity(reqdQuantity);
                carts.add(cart);
                cartRepository.save(cart);
                product.setAvailableQuantity(availableQuantity - reqdQuantity);
                productService.updateSavedProduct(product);

                totals.add(reqdQuantity * product.getPrice());

            }
        });
        if (!carts.isEmpty()) {
            Order order1 = new Order();
            order1.setTotal(totals.stream()
                    .mapToDouble(a -> a)
                    .sum());
            order1.setItems(carts);
            order1.setAddress(order.getAddress());
            order1.setUserEmail(order.getEmailId());
            order1.setUserName(order.getUsername());
            return orderRepository.save(order1);
        } else throw new Exception();
    }

    public Order updateOrder(OrderDomain orderDomain, Long orderId) throws Exception {
        System.out.println("orderDomain = [" + orderDomain + "], orderId = [" + orderId + "]");
        System.out.println("savedOrder " + orderRepository.findOne(orderId));
        if (orderRepository.findOne(orderId) != null) {
            orderRepository.delete(orderId);
            return saveOrderDetails(orderDomain);
        } else {
            throw new Exception("Order not present");
        }
    }
}
