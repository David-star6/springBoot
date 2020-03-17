package com.example.blog.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class DataFormat {

    @Value(value = "${code.success}")
    public Integer successCode;


    @Value("${code.error}")
    private Integer errorCode;


   public HashMap success(Object object){
        HashMap data = new HashMap();
        data.put("code",this.getSuccessCode());
        data.put("msg","success");
        data.put("data",object);
        return data;
    }

   public HashMap error(String msg){
        HashMap data = new HashMap();
        data.put("code",this.getErrorCode());
        data.put("msg",msg);
        data.put("data",null);
        return data;
    }

    public Integer getSuccessCode() {
        return successCode;
    }

    public void setSuccessCode(Integer successCode) {
        this.successCode = successCode;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
