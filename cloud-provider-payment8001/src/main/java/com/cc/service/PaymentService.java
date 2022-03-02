package com.cc.service;

import com.cc.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

	int create(Payment payment);

	Payment getPaymentById(@Param("id")Long id);

}


