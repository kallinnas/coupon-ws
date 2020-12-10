package com.webservice.coupon11.service;

import com.webservice.coupon11.data.Coupon;

public interface CouponService {
    Coupon getCouponById(long id);

    Coupon createCoupon(Coupon coupon);
}
