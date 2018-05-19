package com.springboot.rest.webservice.restfulwebservices.exception;

import java.util.Date;

/**
 * Created by Syril on 19-05-2018.
 */

/**
 * This Class gives a customized implementation of Exception Handler instead of the Spring Default.
 */
public class ExceptionResource {
    private Date timeStamp;
    private String message;
    private String details;

    public ExceptionResource(Date timeStamp, String message, String details) {
        super();
        this.timeStamp = timeStamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
