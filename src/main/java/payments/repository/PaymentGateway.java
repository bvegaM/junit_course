package payments.repository;

import payments.utils.PaymentRequest;
import payments.utils.PaymentResponse;

public interface PaymentGateway {
    PaymentResponse processPayment(PaymentRequest paymentRequest);
}
