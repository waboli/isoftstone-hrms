package com.isoftstone.hrms.common.resp;

public class ServiceResponse<T> {

    private ResponseCode code;

    private String msg;

    private T data;

    public ServiceResponse(ResponseCode code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }



    public ResponseCode getCode() {
        return code;
    }

    public void setCode(ResponseCode code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
