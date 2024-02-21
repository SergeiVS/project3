package service.validation;

import dto.ClientRequest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ValidationRequestTest {

    ValidationRequest validationRequest = new ValidationRequest();


    @Test
    public void checkRequest() {
        //if request is correct
        ClientRequest request = new ClientRequest(1, "null null", "null null");
        assertTrue(validationRequest.checkRequest(request));
    }

    @Test
    public void checkRequestAdd() {
        List<String> errors1 = new ArrayList<>();
        List<String> errors2 = new ArrayList<>();

        ClientRequest request1 = new ClientRequest(0, "na1", "");
        ClientRequest request2 = new ClientRequest(1, "Name1", "Description1");

        boolean result1 = validationRequest.checkRequestAdd(request1, errors1);
        boolean result2 = validationRequest.checkRequestAdd(request2, errors2);

        assertFalse(result1);
        System.out.println(result1 + " : " + errors1);

        assertTrue(result2);
        System.out.println(result2 + " : " + errors2);
    }
}