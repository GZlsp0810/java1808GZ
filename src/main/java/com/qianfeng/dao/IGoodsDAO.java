package com.qianfeng.dao;

import com.qianfeng.bean.WxbGood;

import java.util.List;

public interface IGoodsDAO {
    List<WxbGood> queryGoodsByPage(Integer page);
}
