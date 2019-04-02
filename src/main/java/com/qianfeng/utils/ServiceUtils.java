package com.qianfeng.utils;

import com.qianfeng.service.IGoodService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceUtils {
    public static IGoodService getservice(){
        return  new ClassPathXmlApplicationContext("spring.xml").getBean(IGoodService.class);
    }
}
