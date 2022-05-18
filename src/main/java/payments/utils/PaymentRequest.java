package payments.utils;

public class PaymentRequest {

    private final Double amount;

    public PaymentRequest(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }
}
