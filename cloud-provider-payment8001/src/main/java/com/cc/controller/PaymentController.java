package com.cc.controller;

import com.cc.entity.CommonResult;
import com.cc.entity.Payment;
import com.cc.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

	@Resource
	private PaymentService paymentService;

	@PostMapping("/payment/creat")
	public CommonResult<Payment> create(@RequestBody Payment payment) {

		int result = paymentService.create(payment);
		log.info("******插入结果" + result);
		if (result > 0) {
			return new CommonResult(200, "success", result);
		} else {
			return new CommonResult(400, "fail", null);
		}
	}

	@GetMapping("/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
		Payment payment = paymentService.getPaymentById(id);
		log.info("******查询结果" + payment);
		if (payment != null) {
			return new CommonResult(200, "success,serverPort:", payment);
		} else {
			return new CommonResult(400, "fail", null);
		}
	}
}


