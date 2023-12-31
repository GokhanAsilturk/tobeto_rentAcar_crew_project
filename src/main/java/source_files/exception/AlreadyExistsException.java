package source_files.exception;

import lombok.Getter;
import source_files.exception.exceptionTypes.AlreadyExistsExceptionType;

@Getter
public class AlreadyExistsException extends RuntimeException {

    private final AlreadyExistsExceptionType alreadyExistsExceptionType;
    private String detail;


    public AlreadyExistsException(AlreadyExistsExceptionType alreadyExistsExceptionType, String detail) {
        super(alreadyExistsExceptionType.getMessage());
        this.alreadyExistsExceptionType = alreadyExistsExceptionType;
        this.detail = detail;
    }

    public AlreadyExistsException(AlreadyExistsExceptionType alreadyExistsExceptionType) {
        super(alreadyExistsExceptionType.getMessage());
        this.alreadyExistsExceptionType = alreadyExistsExceptionType;
    }
}
