package com.webservice.coupon11.rest;

import com.webservice.coupon11.data.Coupon;
import com.webservice.coupon11.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/")/*remove api*/
public class CouponController {
    private CouponService service;

    @Autowired
    public CouponController(CouponService service) {
        this.service = service;
    }

    @PostMapping("createCoupon")
    public ResponseEntity<Coupon> createCoupon(@RequestBody Coupon coupon) {
        Coupon newCoupon = service.createCoupon(coupon);
        return ResponseEntity.ok(newCoupon);
    }

    @GetMapping("coupon/{id}")
    public ResponseEntity<Coupon> getCouponById(@PathVariable long id) {
        Coupon coupon = service.getCouponById(id);
        return ResponseEntity.ok(coupon);
    }

}
