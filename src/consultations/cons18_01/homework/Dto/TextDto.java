package Dto;

public class TextDto {

    private String textDto;

    public TextDto(String textDto) {
        this.textDto = textDto;
    }

    public String getTextDto() {
        return textDto;
    }

    @Override
    public String toString() {
        return "TextDto{" +
                "textDto='" + textDto + '\'' +
                '}';
    }
}
