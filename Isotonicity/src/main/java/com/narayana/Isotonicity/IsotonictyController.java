package com.narayana.Isotonicity;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IsotonictyController {
	@Autowired
	IsotonictyRepository isotnicrepository;
	
	protected Logger logger = Logger
			.getLogger(IsotonictyController.class.getName());
	
	@RequestMapping("/Isotonicty/{serumOsmol}")
	public String Isotonicty(@PathVariable("serumOsmol") String serumOsmol) {
		logger.info("accounts-changed byId() invoked: " + serumOsmol);
		String retVal = isotnicrepository.getIsotonicty(serumOsmol);
		logger.info("accounts-microservice byId() found: " + retVal);
		return retVal;
	}

}
