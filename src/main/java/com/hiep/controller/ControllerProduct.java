package com.hiep.controller;

import com.hiep.model.Product;
import com.hiep.service.product.IProductService;
import com.hiep.service.product.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping()
public class ControllerProduct {
    private IProductService productService = new ProductService();

    @GetMapping()
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("/product/list");
        productService.findAll();
        mav.addObject("list",productService.findAll());
        return mav;
    }

    @GetMapping("/creat")
    public ModelAndView creat(){
        Product product = new Product();
        ModelAndView mav = new ModelAndView("/product/creat");
        mav.addObject("product",product);
        return mav;
    }

    @PostMapping("/save")
    public ModelAndView save(Product product){
       productService.save(product);
       ModelAndView mav = index();
       return mav;
    }


}
