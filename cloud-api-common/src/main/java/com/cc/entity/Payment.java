package com.cc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

	private static final long serialVersionUID = 4160273719381295917L;
	
	private Long id;

	private String serial;

}


