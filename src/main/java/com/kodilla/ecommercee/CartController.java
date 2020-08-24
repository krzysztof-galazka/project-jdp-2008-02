package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.CartDto;
import com.kodilla.ecommercee.domain.OrderDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/cart")
public class CartController {

    @PostMapping(value = "/createEmpty")
    public CartDto createEmptyCart(CartDto cartDto) {
        return new CartDto(1L, "empty cart");
    }

    @GetMapping(value = "/getEmptyCart")
    public List<CartDto> getEmptyCart() {
    return new ArrayList<>();
    }

    @PostMapping(value = "/addProduct")
    public CartDto addProductToCart(@RequestBody CartDto cartDto) {
        return new CartDto(1L, "cart");
    }

    @DeleteMapping("/{id}")
    public CartDto deleteProduct(@PathVariable Long productId) {

        return null;
    }

    @PostMapping(value = "/createOrder")
    public OrderDto createOrderFromCart(@RequestBody OrderDto orderDto) {
    return new OrderDto(1L, "order");
    }
}
