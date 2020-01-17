package com.example.bilibili.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

public class ErrorAttributes  extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String,Object> map =  super.getErrorAttributes(webRequest,includeStackTrace);
        map.put("company","ceshi");
        Map<String,Object> ext = (Map<String, Object>) webRequest.getAttribute("ext",0);
        map.put("ext",ext);
        return map;
    }
}
