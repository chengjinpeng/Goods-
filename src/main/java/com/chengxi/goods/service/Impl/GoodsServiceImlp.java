package com.chengxi.goods.service.Impl;

import com.chengxi.goods.dao.TGoodsMapper;
import com.chengxi.goods.domain.TGoods;
import com.chengxi.goods.domain.vo.BaseResult;
import com.chengxi.goods.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chengxi
 * @date 2018/11/13 20:39
 */
@Service
@Transactional
public class GoodsServiceImlp implements GoodsService {

    @Resource
     private TGoodsMapper tGoodsMapper;

    @Override
    public BaseResult selectAllByPage(Integer page, Integer row) {
        PageHelper.startPage(page,row);
        List<TGoods> tGoods = tGoodsMapper.selectAll();

        PageInfo<TGoods> tGoodsPageInfo = new PageInfo<>(tGoods);

        BaseResult baseResult = new BaseResult();
        baseResult.setTotal(tGoodsPageInfo.getTotal());
        baseResult.setData(tGoodsPageInfo.getList());

        return baseResult;
    }
}
