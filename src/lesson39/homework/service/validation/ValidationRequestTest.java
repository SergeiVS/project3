package service.validation;

import dto.ClientRequest;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationRequestTest {

    ValidationRequest validationRequest = new ValidationRequest();


    @Test
    public void checkRequest() {
        //if request is correct
        ClientRequest request1 = new ClientRequest(0, "null null", "null null");
        assertTrue(validationRequest.checkRequest(request1));
    }

    @Test
    public void checkRequestAdd() {
        //if request is correct

    }
}