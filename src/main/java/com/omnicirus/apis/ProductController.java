package com.omnicirus.apis;

import com.omnicirus.models.Product;
import com.omnicirus.models.ProductType;
import com.omnicirus.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add/product")
    public Response addProduct(@RequestBody Product product) {
        Product product1 = productService.add(product);
        if (product1 != null) {
            return Response.accepted().entity(product).build();

        } else {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error in serving request").build();

        }
    }

    @PostMapping("/update/product")
    public Response updateProduct(@RequestBody Product item) {
        Product result = productService.updateSavedProduct(item);
        if (result != null) {
            return Response.accepted().entity(result).build();
        } else {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Error in serving request").build();
        }
    }

    @GetMapping("/get/product/byType/{type}")
    public Response getAllProductsByType(@PathVariable ProductType type) {
        List<Product> products = productService.listAllProductsByType(type);
        if (products.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).entity("There is no product of given type").build();
        } else {
            return Response.status(Response.Status.ACCEPTED).entity(products).build();

        }
    }

    @DeleteMapping("/del/product/{productId}")
    public Response deleteProduct(@PathVariable long productId) {
        Product product = productService.deleteProduct(productId);
        if (product == null) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("There is no product with the given ID").build();

        } else {
            return Response.accepted().entity(product).build();

        }
    }

    @GetMapping("/get/product/all")
    public Response getproductList() {
        List<Product> productList = productService.listAllProducts();
        if (productList.isEmpty()) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("There are no products").build();

        } else {
            return Response.accepted().entity(productList).build();

        }
    }

    @GetMapping("/get/product/{productId}")
    public Response getProduct(@PathVariable long productId) {
        Product product = productService.getProduct(productId);
        if (product == null) {
            return Response.status(Response.Status.NO_CONTENT).entity("There is no product with the given ID").build();

        } else {
            return Response.accepted().entity(product).build();

        }
    }

}
