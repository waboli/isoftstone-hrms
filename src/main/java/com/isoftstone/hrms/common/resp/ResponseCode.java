package com.isoftstone.hrms.common.resp;

public enum ResponseCode {

    OK(200, "OK"), ERROR(500, "INTERNAL SERVER ERROR"), UNAUTHORIZED(401, "UNAUTHORIZED"), FORBIDDEN(403, "FORBIDDEN"), NOTFOUND(404, "NOT FOUND");

    private int code;

    private String codeDesc;

    private ResponseCode(int code, String codeDesc) {
        this.code = code;
        this.codeDesc = codeDesc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }
}
