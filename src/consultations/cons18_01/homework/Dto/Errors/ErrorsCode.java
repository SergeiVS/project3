package consultations.cons18_01.homework.Dto.Errors;

public enum ErrorsCode {
    ERRORS_CODE0("Ok", 0),
    ERRORS_CODE1("Text is not added", 1),
    ERRORS_CODE2("Text is to short", 2),
    ERRORS_CODE3("Internal error", 3);

    private String description;
    private int errorCode;

    ErrorsCode(String description, int errorCode) {
        this.description = description;
        this.errorCode = errorCode;
    }
}
