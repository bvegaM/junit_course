package payments.utils;

import enums.PaymentStatus;

public class PaymentResponse {

    private final PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
