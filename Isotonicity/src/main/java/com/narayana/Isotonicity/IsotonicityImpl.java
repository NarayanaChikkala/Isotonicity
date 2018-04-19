package com.narayana.Isotonicity;

import java.util.logging.Logger;

import org.springframework.stereotype.Repository;

@Repository
public class IsotonicityImpl implements IsotonicityRepository {
	protected Logger logger = Logger
			.getLogger(IsotonicityImpl.class.getName());



	@Override
	public String getisotonicity(String serumOsmol_isotonicity) {
		// TODO Auto-generated method stub
		if((Integer.parseInt(serumOsmol_isotonicity)>280) && (Integer.parseInt(serumOsmol_isotonicity)<295)) {
			
			return "isotonic";
		}
		else {
			
			return "notIsotonic";
		}
	}

}
