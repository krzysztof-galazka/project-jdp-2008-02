package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.CartDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/cart")
public class CartController {

    @PostMapping
    public void createEmptyCart(@PathVariable Long cartId) {
    }

    @GetMapping
    public void getEmptyCart(@PathVariable Long cartId) {

    }

    @PostMapping
    public void addProductToCart(@PathVariable Long productId) {

    }

    @DeleteMapping
    public boolean deleteProduct(@PathVariable Long cartId) {
        return true;
    }

    @PostMapping
    public void createOrderFromCart(@RequestBody CartDto cartDto) {

    }
}
