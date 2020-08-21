package com.kodilla.ecommercee;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@Slf4j
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/v1/product")
public class ProductController {
    private final ProductMapper productMapper;
    private final ProductServiceDb productServiceDb;

    @GetMapping
    public List<ProductDto> getProducts() {
        log.info("Get products");
        return productMapper.mapToProductDto(productServiceDb.getAllProducts());
    }

    @GetMapping("/{id}")
    public ProductDto getProduct(@PathVariable final Long id) throws ProductNotFoundException {
        log.info("Get product by ID: " + id);
        return productMapper.mapToProductDto(productServiceDb.getProductById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product doesn't exist in database!")));
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void createProduct(@RequestBody final ProductDto productDto) {
        log.info("Create product by: " + productDto);
        productServiceDb.saveProduct(productMapper.mapToProduct(productDto));
    }

    @PutMapping
    public ProductDto updateProduct(@RequestBody final ProductDto productDto) {
        log.info("Update product by: " + productDto);
        return productMapper.mapToProductDto(productServiceDb.saveProduct(productMapper.mapToProduct(productDto)));
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable final Long id) {
        log.info("Delete product by ID: " + id);
        productServiceDb.deleteProductById(id);
    }
}
