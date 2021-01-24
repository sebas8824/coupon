package com.mercadolibre.coupon.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Coupon {
    private List<String> item_ids;
    private Float amount;
}
