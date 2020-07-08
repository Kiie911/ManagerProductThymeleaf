package com.hiep.service.product;

import com.hiep.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static Map<Long, Product> productsMap ;

    static {
        productsMap = new HashMap<>();
        productsMap.put(1L,new Product(1L,"iphone1", 100 , 5, "iphone,black" ));
        productsMap.put(2L,new Product(2L,"iphone2", 200 , 10, "iphone,black" ));
        productsMap.put(3L,new Product(3L,"iphone3", 300 , 15, "iphone,black" ));
        productsMap.put(4L,new Product(4L,"iphone4", 400 , 20, "iphone,black" ));
        productsMap.put(5L,new Product(5L,"iphone5", 500 , 25, "iphone,black" ));
        productsMap.put(6L,new Product(6L,"iphone6", 600 ,30 , "iphone,black" ));
    }

    @Override
    public List<Product> findAll() {
        ArrayList list = new ArrayList<>(productsMap.values());
        return list;
    }

    @Override
    public Product findById(Long id) {
        return productsMap.get(id);
    }

    @Override
    public void save(Product model) {
        productsMap.put(model.getId(),model);
    }

    @Override
    public void remove(Long id) {
        productsMap.remove(id);

    }
}
