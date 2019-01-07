package com.chengxi.goods.service;

import com.chengxi.goods.domain.vo.BaseResult;

/**
 * @author chengxi
 * @date 2018/11/13 20:39
 */
public interface GoodsService {

    /**
     * 通过分页查找所有
     * @param page
     * @param row
     * @return
     */
    public BaseResult selectAllByPage(Integer page,Integer row);


}
