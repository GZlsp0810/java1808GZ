package com.qianfeng.dao.impl;

import com.qianfeng.bean.WxbGood;
import com.qianfeng.dao.IGoodsDAO;
import com.qianfeng.mapper.GoodsMapper;
import com.qianfeng.utils.SystemConstantsUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class IGoodsimpl implements IGoodsDAO {
    @Autowired
    private SqlSession session;
    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) {
        List<WxbGood> goods = session.getMapper(GoodsMapper.class).queryGoodsByPage(page, SystemConstantsUtils.Page.PAGE_SIZE);
        return goods;
    }
}
