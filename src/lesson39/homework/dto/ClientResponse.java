package dto;

import java.util.Objects;

public class ClientResponse<T> {

    private int responseCode;
    // 200 - OK
    // 400 - error

    private T responseInfo;

    private String message;
    // запись данных произведена успешно
    // таких данных в коллекции нет


    public ClientResponse(int responseCode, T responseInfo, String message) {
        this.responseCode = responseCode;
        this.responseInfo = responseInfo;
        this.message = message;
    }

    public T getResponseInfo() {
        return responseInfo;
    }

    @Override
    public String toString() {
        return "ClientResponse{" +
                "responseCode=" + responseCode +
                ", responseInfo=" + responseInfo +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientResponse<?> that = (ClientResponse<?>) o;
        return responseCode == that.responseCode && Objects.equals(getResponseInfo(), that.getResponseInfo()) && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseCode, getResponseInfo(), message);
    }
}
