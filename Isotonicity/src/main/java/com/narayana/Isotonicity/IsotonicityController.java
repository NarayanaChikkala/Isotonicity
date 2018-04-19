package com.narayana.Isotonicity;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IsotonicityController {
	@Autowired
	IsotonicityRepository isotonicityrepository;
	
	protected Logger logger = Logger
			.getLogger(IsotonicityController.class.getName());
	
	@RequestMapping("/isotonicity/{serumOsmol_isotonicity}")
	public String isotonicity(@PathVariable("serumOsmol_isotonicity") String serumOsmol_isotonicity) {
		logger.info("accounts-changed byId() invoked: " + serumOsmol_isotonicity);
		String retVal = isotonicityrepository.getisotonicity(serumOsmol_isotonicity);
		logger.info("accounts-microservice byId() found: " + retVal);
		return retVal;
	}

}
