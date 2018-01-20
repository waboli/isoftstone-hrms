package com.isoftstone.hrms.common.resp;

public class  ResponseHelper {

    public static ServiceResponse OK(){
        return new ServiceResponse<>(ResponseCode.OK, null, null);
    }

    public static ServiceResponse OK(String msg){
        return new ServiceResponse<>(ResponseCode.OK, msg, null);
    }

    public static <T> ServiceResponse<T> OK(T data){
        return new ServiceResponse<>(ResponseCode.OK, null, data);
    }

    public static <T> ServiceResponse<T> OK(String msg , T data){
        return new ServiceResponse<>(ResponseCode.OK, msg, data);
    }

    public static <T> ServiceResponse<T> OK(ResponseCode code, String msg , T data){
        return new ServiceResponse<>(code, msg, data);
    }

    public static ServiceResponse ERROR(){
        return new ServiceResponse<>(ResponseCode.ERROR, null, null);
    }

    public static ServiceResponse ERROR(String msg){
        return new ServiceResponse<>(ResponseCode.ERROR, msg, null);
    }

    public static <T> ServiceResponse<T> ERROR(T data){
        return new ServiceResponse<>(ResponseCode.ERROR, null, data);
    }

    public static <T> ServiceResponse<T> ERROR(String msg , T data){
        return new ServiceResponse<>(ResponseCode.ERROR, msg, data);
    }

    public static <T> ServiceResponse<T> ERROR(ResponseCode code, String msg , T data){
        return new ServiceResponse<>(code, msg, data);
    }
}
