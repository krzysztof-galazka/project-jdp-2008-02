package com.kodilla.ecommercee.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public final class ProductDto {
    private final Long id;
    private final String value;
}
