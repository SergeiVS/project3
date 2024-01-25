package Dto.Errors;



public class ErrorsDto {
    private consultations.cons18_01.homework.Dto.Errors.ErrorsCode errorCode;
    private String description;

    public ErrorsDto(consultations.cons18_01.homework.Dto.Errors.ErrorsCode errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }
}
