package com.omnicirus.apis;

import com.omnicirus.domain.OrderDomain;
import com.omnicirus.models.Order;
import com.omnicirus.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;


@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create/order")
    public Response addItemsToCart(@RequestBody OrderDomain order) throws Exception {
        if (order.getItemDomain().isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).entity("Item list can't be empty").build();
        }
        Order order1 = null;
        try {
            order1 = orderService.addItemsToCart(order);
        } catch (Exception e) {
            return Response.noContent().entity("Error serving the request").build();
        }
        return Response.accepted().entity(order1).build();
    }

    @PutMapping("/update/order/{orderId}")
    public Response addItemsToCart(@RequestBody OrderDomain order, @PathVariable Long orderId) throws Exception {
        if (orderId == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity("OrderId can not be empty").build();
        }

        Order order1 = null;
        try {
            order1 = orderService.updateOrder(order, orderId);
        } catch (Exception e) {
            return Response.noContent().entity(e.getMessage()).build();
        }
        return Response.accepted().entity(order1).build();
    }

}
