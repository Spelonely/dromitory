package com.zzwq.dromitory.common;

public enum ResponseCode {
    SUCCESS(0, "成功"),
    ERROR(1, "错误"),
    NEED_LOGIN(10, "需要登陆"),
    FRESH(2, "刷新重试");

    private Integer code;
    private String dec;

    public Integer getCode() {
        return code;
    }

    public String getDec() {
        return dec;
    }

    ResponseCode(Integer code, String dec) {
        this.code = code;
        this.dec = dec;
    }


}
