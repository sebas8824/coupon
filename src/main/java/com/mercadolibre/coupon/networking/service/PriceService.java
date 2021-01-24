package com.mercadolibre.coupon.networking.service;

import com.mercadolibre.coupon.model.Coupon;
import org.springframework.stereotype.Component;

@Component
public interface PriceService {
    Coupon getOptimizedCoupon(Coupon coupon);
}
