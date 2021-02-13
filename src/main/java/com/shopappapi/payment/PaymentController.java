package com.shopappapi.payment;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	@RequestMapping(method=RequestMethod.POST, value="/makePayment")
	public boolean makePayment(@RequestBody Object body) {
		System.out.print(body);
		return true;
	}
}
