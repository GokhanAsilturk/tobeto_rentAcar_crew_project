package source_files.core.exception;

import lombok.Getter;
import lombok.Setter;
import source_files.core.exception.exceptionTypes.PaymentExceptionType;

@Getter
@Setter
public class PaymentException extends RuntimeException {
    private final PaymentExceptionType paymentExceptionType;

    private String detail;


    public PaymentException(PaymentExceptionType paymentExceptionType, String detail) {
        super(paymentExceptionType.getMessage());
        this.paymentExceptionType = paymentExceptionType;
        this.detail = detail;
    }

    public PaymentException(PaymentExceptionType paymentExceptionType) {
        super(paymentExceptionType.getMessage());
        this.paymentExceptionType = paymentExceptionType;
        this.detail = paymentExceptionType.getMessage();
    }
}
