package com.zyc.util;

/**
 * Created by YuChen Zhang on 18/01/19.
 */
public class StringUtil {
    public static boolean isNull(String s){
        if(null!=s&&!"".equals(s.trim())){
            return false;
        }else{
            return true;
        }
    }
    public static String appendLike(String s){
        return "%"+s+"%";
    }
}
