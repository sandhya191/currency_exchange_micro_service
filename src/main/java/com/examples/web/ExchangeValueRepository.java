package com.examples.web;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author Sandhya
 * Repository of Currency Exchange Service
 *
 */

public interface ExchangeValueRepository extends 
JpaRepository<ExchangeValue, Long>{
	
ExchangeValue findByFromAndTo(String from, String to);
}


