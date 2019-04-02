package com.qianfeng.service.impl;

import com.qianfeng.bean.WxbGood;
import com.qianfeng.dao.IGoodsDAO;
import com.qianfeng.service.IGoodService;
import com.qianfeng.utils.SystemConstantsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class IGoodServiceimpl implements IGoodService {
    @Autowired
    private IGoodsDAO goodsDAO;
    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) {
        if (page<1){
            throw  new IndexOutOfBoundsException("页面不能小于1");
        }
        //计算起始下标
        int index=(page-1)* SystemConstantsUtils.Page.PAGE_SIZE;
        List<WxbGood> goods = goodsDAO.queryGoodsByPage(index);
        return goods;
    }
}
