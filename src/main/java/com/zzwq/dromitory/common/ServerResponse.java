package com.zzwq.dromitory.common;





import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//保证序列化json的时候,如果是null的对象,key也会消失
public class ServerResponse<T> implements Serializable {

    private Integer stauts;
    private String msg;
    private T data;

    private ServerResponse(Integer stauts) {
        this.stauts = stauts;
    }

    private ServerResponse(Integer stauts, String msg, T data) {
        this.stauts = stauts;
        this.msg = msg;
        this.data = data;
    }

    private ServerResponse(Integer stauts, String msg) {
        this.stauts = stauts;
        this.msg = msg;
    }

    private ServerResponse(Integer stauts, T data) {
        this.stauts = stauts;
        this.data = data;
    }

    public Integer getStauts() {
        return stauts;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return this.stauts == ResponseCode.SUCCESS.getCode();
    }

    public static <T> ServerResponse<T> createBySuccess() {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponse<T> createBySuccess(String msg) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> ServerResponse<T> createBySuccess(String msg, T data) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> ServerResponse<T> createBySuccess(T data) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), data);
    }

    public static <T> ServerResponse<T> createByError(String msg) {
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), msg);
    }

    public static <T> ServerResponse<T> createByError() {
        return new ServerResponse<T>(ResponseCode.ERROR.getCode());
    }

    public static <T> ServerResponse<T> createByErrordefault() {
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDec());
    }

    public static <T> ServerResponse<T> createByDefault(Integer code, String dec) {
        return new ServerResponse<T>(code, dec);
    }

}
