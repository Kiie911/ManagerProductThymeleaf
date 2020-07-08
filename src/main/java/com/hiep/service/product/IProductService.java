package com.hiep.service.product;

import com.hiep.model.Product;
import com.hiep.service.IService;

import java.util.List;

public interface IProductService extends IService<Product> {
    @Override
    List<Product> findAll();

    @Override
    Product findById(Long id);

    @Override
    void save(Product model);

    @Override
    void remove(Long id);
}
