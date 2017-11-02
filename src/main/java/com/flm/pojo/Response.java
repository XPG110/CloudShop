package com.flm.pojo;

public class Response<T> {

    private static final String success = "success";
    private static final String error = "error";

    private Meta meta;
    private T Data;

    public Response success() {
        Response response = new Response();
        return response;
    }

    public class Meta {
        private boolean success;
        private String message;
    }
}
