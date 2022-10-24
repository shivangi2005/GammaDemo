package uk.co.gamma.address.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class BlackListServiceException extends RuntimeException{

    private String postCode;

    public BlackListServiceException(String postCode) {
        super(String.format("Error while calling Blacklisting Service for postcode %s",postCode));
        this.postCode = postCode;
    }

    public String getPostCode() {
        return postCode;
    }
}
