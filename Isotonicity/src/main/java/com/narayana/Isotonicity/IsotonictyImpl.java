package com.narayana.Isotonicity;

import java.util.logging.Logger;

import org.springframework.stereotype.Repository;

@Repository
public class IsotonictyImpl implements IsotonictyRepository {
	protected Logger logger = Logger
			.getLogger(IsotonictyImpl.class.getName());



	@Override
	public String getIsotonicty(String serumOsmol) {
		// TODO Auto-generated method stub
		if((Integer.parseInt(serumOsmol)>280) && (Integer.parseInt(serumOsmol)<295)) {
			
			return "isotonic";
		}
		else {
			
			return "notIsotonic";
		}
	}

}
