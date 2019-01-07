package com.chengxi.goods.controller;

import com.chengxi.goods.domain.vo.BaseResult;
import com.chengxi.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengxi
 * @date 2018/11/13 20:47
 */
@RestController
@RequestMapping(value = "/goods")
public class GoodController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping(value = "/{page}/{row}")
    public ResponseEntity<BaseResult> selectAllByPage(@PathVariable Integer page,@PathVariable Integer row){
        BaseResult baseResult = goodsService.selectAllByPage(page, row);

        return new ResponseEntity<>(baseResult,HttpStatus.OK);
    }

}
