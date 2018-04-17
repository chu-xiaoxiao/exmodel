package com.zyc.controller;

import com.zyc.exception.StatusException;
import com.zyc.util.JSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {
    @ExceptionHandler(StatusException.class)
    public String StatusException(StatusException s){
        return JSONResult.fillResultString(s.getMessage());
    }

}
