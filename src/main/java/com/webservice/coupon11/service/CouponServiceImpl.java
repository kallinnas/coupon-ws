package com.webservice.coupon11.service;

import com.webservice.coupon11.data.Coupon;
import com.webservice.coupon11.data.CouponRepository;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Transactional
public class CouponServiceImpl implements CouponService {
    private CouponRepository repository;

    public CouponServiceImpl(CouponRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Coupon createCoupon(Coupon coupon) {
        coupon.setTime(LocalDateTime.now());
        return repository.save(coupon);
    }

    @Override
    public Coupon getCouponById(long id) {
        return repository.findCouponById(id).get();
    }
}
