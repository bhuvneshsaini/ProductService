package com.productservice.productservice.services;

import com.productservice.productservice.dtos.GenericProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selfProductService")
public class SelfProductService implements ProductService{

    @Override
    public GenericProductDto getProductById(Long id) {
        //implementation
        return null;
    }
    @Override
    public List<GenericProductDto> getAllProducts() {
           return null;
    }

    @Override
    public GenericProductDto deleteProductById(Long id) {
        return null;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto genricProductDto) {
        return null;
    }

    @Override
    public void updateProductById() {

    }
}

