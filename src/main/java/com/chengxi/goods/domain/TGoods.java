package com.chengxi.goods.domain;

import javax.persistence.*;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
*
* 生成类: t_goods
* 创建时间: 2018年11月13日
* 作者: chengxi
*/

@Entity
@Table(name = "t_goods")
@Data
public class TGoods{


@Id
@Column(name = "id")
private Integer id;

@Column(name = "name")
private String name;

@Column(name = "image")
private String image;

@Column(name = "price")
private Double price;}