package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/product")
public final class ProductController {
    @GetMapping
    public List<ProductDto> getProducts() {
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public ProductDto getProduct(@PathVariable final Long id) {
        return new ProductDto(1l,"Product");
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public ProductDto createProduct(@RequestBody final ProductDto productDto) {
        return new ProductDto(1l,"Product");
    }

    @PutMapping
    public ProductDto updateProduct(@RequestBody final ProductDto productDto) {
        return new ProductDto(1l,"Product");
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable final Long id) {
        System.out.println("Delete product");
    }
}
