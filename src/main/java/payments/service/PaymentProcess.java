package payments.service;

import enums.PaymentStatus;
import payments.repository.PaymentGateway;
import payments.utils.PaymentRequest;
import payments.utils.PaymentResponse;

public class PaymentProcess {

    private final PaymentGateway paymentGateway;

    public PaymentProcess(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean processPayment(Double amount) {
        try{
            if (amount.isNaN() || amount <= 0 || amount.isInfinite()) {
                throw new IllegalArgumentException("Amount cannot be NaN");
            }
            PaymentResponse response = paymentGateway.processPayment(new PaymentRequest(amount));
            return response.getStatus() == PaymentStatus.PAID;
        }catch (NullPointerException e){
            throw new IllegalArgumentException("Amount cannot be NaN");
        }

    }
}
