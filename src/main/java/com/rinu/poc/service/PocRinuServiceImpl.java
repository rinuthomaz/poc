/**
 * 
 */
package com.rinu.poc.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author rinu.thomas
 * @date Jul 22, 2018
 * @filename PocRinuServiceImpl.java
 */
@Transactional
@Service
public class PocRinuServiceImpl implements PocRinuService {
	
	//@Autowired
	

	/* (non-Javadoc)
	 * @see com.rinu.poc.service.PocRinuService#getThatManAnAward(java.lang.String)
	 */
	@Override
	public String getThatManAnAward(String value) {
		value = "rinu";
		return value;
	}

}
