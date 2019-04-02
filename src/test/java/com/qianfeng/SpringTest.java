package com.qianfeng;

import com.qianfeng.bean.WxbGood;
import com.qianfeng.service.IGoodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {
    @Autowired
    private IGoodService goodService;
    @Test
    public void  test(){
     List<WxbGood> goods=goodService.queryGoodsByPage(2);
        for (WxbGood good: goods
             ) {
            System.out.println(good.getGoodName());
        }


    }

    public static IGoodService getService(){
        return new ClassPathXmlApplicationContext("spring.xml").getBean(IGoodService.class);
    }
}
