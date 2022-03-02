package com.cc.dao;

import com.cc.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

	int create(Payment payment);

	Payment getPaymentById(@Param("id")Long id);

}


