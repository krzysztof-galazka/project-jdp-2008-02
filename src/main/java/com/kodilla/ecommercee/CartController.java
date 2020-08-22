package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.CartDto;
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
        return new CartDto(1L, "cart");
    }

    @GetMapping
    public List<CartDto> getEmptyCart() {
    return new ArrayList<>();
    }

    @PostMapping(value = "/addProduct")
    public CartDto addProductToCart(@RequestBody CartDto cartDto) {
        return new CartDto(1L, "cart");
    }

    @DeleteMapping
    public CartDto deleteProduct(@PathVariable Long productId) {

        return null;
    }

    @PostMapping(value = "/createOrder")
    public String createOrderFromCart(@RequestBody CartDto cartDto) {
    return "Order created";
    }
}
