package ui;

import dto.Response;

public class ResponseCheck <T> {

    public void responseCheck(Response<T> response) {

        if (response.getMessage().equals("Ok")) {
            System.out.println(response.getData());
        } else {
            System.out.println(response.getMessage());
        }
    }
}
