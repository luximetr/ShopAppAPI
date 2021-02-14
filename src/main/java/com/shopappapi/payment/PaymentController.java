package com.shopappapi.payment;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	public class MakePaymentResult {

		private boolean success;
		
		public MakePaymentResult(boolean success) {
			super();
			this.success = success;
		}
		
		public boolean isSuccess() {
			return success;
		}

		public void setSuccess(boolean success) {
			this.success = success;
		}
	}

	@RequestMapping(method=RequestMethod.POST, value="/makePayment")
	public MakePaymentResult makePayment(@RequestBody PaymentForm paymentForm) {
		int currentYear = 2021;
		if (paymentForm.getPaymentInfo().getExpiredYear() >= currentYear) {
			return new MakePaymentResult(true);
		} else {
			return new MakePaymentResult(false);
		}
	}
}
