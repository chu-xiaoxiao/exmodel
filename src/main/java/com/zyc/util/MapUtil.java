package com.zyc.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * Created by YuChen Zhang on 18/01/23.
 */
public class MapUtil {
    //Map转换为JavaBean
    public static <T> T map2bean(Map<String,Object> map, Class<T> clz) throws Exception{
        //创建JavaBean对象
        T obj = clz.newInstance();
        //获取指定类的BeanInfo对象
        BeanInfo beanInfo = Introspector.getBeanInfo(clz, Object.class);
        //获取所有的属性描述器
        PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
        for(PropertyDescriptor pd:pds){
            Object value = map.get(pd.getName());
            Method setter = pd.getWriteMethod();
            setter.invoke(obj, value);
        }
        return  obj;
    }
}
