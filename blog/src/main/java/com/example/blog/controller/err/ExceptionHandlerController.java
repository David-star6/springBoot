package com.example.blog.controller.err;

import com.example.blog.utils.WebResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(Exception.class)
    public WebResponse exceptionHandler(Exception e) {
        e.printStackTrace();
        WebResponse res = new WebResponse(-1, "内部错误", null);
        return res;
    }

}
