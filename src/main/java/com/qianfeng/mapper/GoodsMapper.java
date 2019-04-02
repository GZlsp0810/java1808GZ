package com.qianfeng.mapper;

import com.qianfeng.bean.WxbGood;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface GoodsMapper {
    /**
     * 分页查询
     * @param index
     * @param size
     * @return
     */
    List<WxbGood> queryGoodsByPage(@Param("index") Integer index,@Param("size") Integer size);
}
