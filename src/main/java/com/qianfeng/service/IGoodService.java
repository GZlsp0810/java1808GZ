package com.qianfeng.service;

import com.qianfeng.bean.WxbGood;

import java.util.List;

public interface IGoodService {
    List<WxbGood> queryGoodsByPage(Integer page);
}
