package com.dagibu.javatests.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
