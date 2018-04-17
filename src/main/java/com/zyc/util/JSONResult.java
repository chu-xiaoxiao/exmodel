package com.zyc.util;

import com.alibaba.fastjson.JSONObject;
import com.zyc.exception.StatusException;

import java.util.List;

public class JSONResult {

    public JSONObject jsonObject;

    public JSONResult(String json) throws StatusException {
        this.jsonObject = checkResult(json);
    }

    public static String fillResultString(Integer status, String message, Object result) {
        JSONObject jsonObject = new JSONObject() {{
            put("status", status);
            put("message", message);
            put("result", result);
        }};
        return jsonObject.toString();
    }

    public static String fillResultString(String message, Object result) {
        return fillResultString(200, message, result);
    }

    public static String fillResultString(Object result) {
        return fillResultString("请求成功", result);
    }

    public static JSONObject checkResult(String json) throws StatusException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        if (jsonObject.getInteger("status") != 200) {
            throw new StatusException("状态码不是200" + jsonObject.getInteger("status"));
        }
        return jsonObject;
    }

    public String getResult() {
        return this.jsonObject.get("result").toString();
    }

    public <T> T getResult(Class<T> clazz){
        return jsonObject.getObject("result",clazz);
    }

    public <T> List<T> getResultAsArray(Class<T> clazz){
        return JSONObject.parseArray(getResult(),clazz);
    }
}
