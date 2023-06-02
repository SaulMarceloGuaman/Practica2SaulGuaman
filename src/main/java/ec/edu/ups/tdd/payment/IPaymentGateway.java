package ec.edu.ups.tdd.payment;

public interface IPaymentGateway {

    public PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
