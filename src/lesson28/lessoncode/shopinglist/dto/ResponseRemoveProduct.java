package lessoncode.shopinglist.dto;

import lessoncode.shopinglist.dto.error.ErrorDto;

import java.util.List;

public class ResponseRemoveProduct {
   private boolean isRemoved;
    private List<ErrorDto> errorDtoList;

    public ResponseRemoveProduct(boolean isRemoved, List<ErrorDto> errorDtoList) {
        this.isRemoved = isRemoved;
        this.errorDtoList = errorDtoList;
    }

    public boolean isRemoved() {
        return isRemoved;
    }

    public List<ErrorDto> getErrorDtoList() {
        return errorDtoList;
    }

    @Override
    public String toString() {
        return "ResponseRemoveProduct{" +
                "isRemoved=" + isRemoved +
                ", errorDtoList=" + errorDtoList +
                '}';
    }
}
