package com.imooc.cloudseller.product.service.impl;

import com.imooc.cloudseller.product.dataobject.ProductInfo;
import com.imooc.cloudseller.product.enums.ProductStatusEnum;
import com.imooc.cloudseller.product.repository.ProductInfoRepository;
import com.imooc.cloudseller.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 廖师兄
 * 2017-12-09 21:59
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;


    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }


}
