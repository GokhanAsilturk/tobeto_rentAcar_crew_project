package src.core.exception;

import lombok.Getter;
import src.core.exception.type.NotSuitableExceptionType;

@Getter
public class NotSuitableException extends RuntimeException {
    private final NotSuitableExceptionType notSuitableExceptionType;
    private final String detail;

    public NotSuitableException(NotSuitableExceptionType notSuitableExceptionType, String detail) {
        super(notSuitableExceptionType.getMessage());
        this.notSuitableExceptionType = notSuitableExceptionType;
        this.detail = detail;
    }

    public NotSuitableException(NotSuitableExceptionType notSuitableExceptionType) {
        super(notSuitableExceptionType.getMessage());
        this.notSuitableExceptionType = notSuitableExceptionType;
        this.detail = notSuitableExceptionType.getMessage();
    }

    @Override
    public String toString() {
        return "NotSuitableException{" +
                "errorCode=" + notSuitableExceptionType.getErrorCode() +
                ", detail='" + detail + '\'' +
                '}';
    }
}
