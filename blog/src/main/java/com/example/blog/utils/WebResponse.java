package com.example.blog.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.HashMap;

@Component
public class WebResponse {

    private Integer code ;// 返回的状态
    private String msg;// 返回的信息
    private Object data;// 返回数据
    private long timer;//服务器返回时间

    public WebResponse(){

    }

    public WebResponse(Integer code ,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.timer = Instant.now().getEpochSecond();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public long getTimer() {
        return timer;
    }

    public void setTimer(long timer) {
        this.timer = timer;
    }
}
