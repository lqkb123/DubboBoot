package com.liqiang.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.enjoy.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public String getDetail(String id) {
        System.out.println(super.getClass().getName()+"被调用一次："+System.currentTimeMillis());
        return "iponex 售价：1万元";
    }
}
