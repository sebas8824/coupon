package com.mercadolibre.coupon.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemResponse {
    private String id;
    private Float price;
}
