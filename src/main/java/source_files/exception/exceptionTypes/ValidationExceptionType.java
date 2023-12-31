package source_files.exception.exceptionTypes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ValidationExceptionType {

    VALIDATION_EXCEPTION(3000, "Validation Rejected !");

    //------------------------------------------------------------------
    private final Integer errorCode;
    private final String message;


}
