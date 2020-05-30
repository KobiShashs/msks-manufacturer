package com.shasha.msksmanufacturer.web.advice;

/**
 * Created by kobis on 27 May, 2020
 */
public class ErrorDetails {
    private long code;
    private String message;
    private String value;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}