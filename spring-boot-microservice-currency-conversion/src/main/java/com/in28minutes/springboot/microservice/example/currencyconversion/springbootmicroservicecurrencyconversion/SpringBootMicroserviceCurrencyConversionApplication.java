package com.in28minutes.springboot.microservice.example.currencyconversion.springbootmicroservicecurrencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringBootMicroserviceCurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceCurrencyConversionApplication.class, args);
	}



	public class CurrencyConversionBean {
		private Long id;
		private String from;
		private String to;
		private BigDecimal conversionMultiple;
		private BigDecimal quantity;
		private BigDecimal totalCalculatedAmount;
		private int port;

		public CurrencyConversionBean() {

		}

		public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
									  BigDecimal totalCalculatedAmount, int port) {
			super();
			this.id = id;
			this.from = from;
			this.to = to;
			this.conversionMultiple = conversionMultiple;
			this.quantity = quantity;
			this.totalCalculatedAmount = totalCalculatedAmount;
			this.port = port;
		}



}

