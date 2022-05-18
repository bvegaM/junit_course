package payments.service;

import enums.PaymentStatus;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import payments.repository.PaymentGateway;
import payments.utils.PaymentResponse;

import static org.junit.Assert.*;

public class PaymentProcessTest {

    @Mock
    private PaymentGateway paymentGateway;
    @InjectMocks
    private PaymentProcess paymentProcess;

    @Before
    public void setup(){
        this.paymentGateway = Mockito.mock(PaymentGateway.class);
        this.paymentProcess = new PaymentProcess(paymentGateway);
    }

    @Test
    public void sucess_payment_process(){
        Mockito.when(paymentGateway.processPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.PAID));
        assertTrue(paymentProcess.processPayment(1000.00));
    }

    @Test
    public void wrong_sucess_payment_process(){
        Mockito.when(paymentGateway.processPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.NOT_PAID));
        assertFalse(paymentProcess.processPayment(1000.00));
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception_payment_process_zero_value(){
        Mockito.when(paymentGateway.processPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.PAID));
        paymentProcess.processPayment(0.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception_payment_process_null_value(){
        Mockito.when(paymentGateway.processPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.PAID));
        paymentProcess.processPayment(null);
    }

}