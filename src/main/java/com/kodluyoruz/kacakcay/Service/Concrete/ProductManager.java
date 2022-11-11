package com.kodluyoruz.kacakcay.Service.Concrete;


import com.kodluyoruz.kacakcay.Dto.RequestDto.AddedProductRequestDto;
import com.kodluyoruz.kacakcay.Dto.ResponseDto.ProductResponseDto;
import com.kodluyoruz.kacakcay.Models.Category;
import com.kodluyoruz.kacakcay.Models.Product;
import com.kodluyoruz.kacakcay.Repository.CategoryDao;
import com.kodluyoruz.kacakcay.Repository.ProductDao;
import com.kodluyoruz.kacakcay.Service.Abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductManager implements ProductService {


    private final ProductDao productDao;

    private final ModelMapper modelMapper;

    private final  CategoryDao categoryDao;


   // Aspects Attribute

    @Override

    public String add(AddedProductRequestDto addedProductRequestDto) {
   /*     if (addedProductRequestDto.getProductName().length()<2){
            return "Ürün adı Minimum 2 Karakterli olmalıdır.";
        }

        if (addedProductRequestDto.getUnitPrice()<0){
            return "0 dan küçük değer girilemez.";
        }*/


        Category category=this.categoryDao.findByCategoryId(addedProductRequestDto.getCategoryId());
        Product product=new Product();
        product.setProductName(addedProductRequestDto.getProductName());
        product.setUnitPrice(addedProductRequestDto.getUnitPrice());
        product.setStock(addedProductRequestDto.getStock());
        product.setCategory(category);
        this.productDao.save(product);
        return "Ürün eklendi.";
    }


    @Override
    public void delete(int id) {
        Product product=this.productDao.findByProductId(id);
        this.productDao.delete(product);
    }

    @Override
    public List<ProductResponseDto> getAll() {
        List<ProductResponseDto> productResponseDtoList=new ArrayList<>();
        List<Product> products=this.productDao.findAll();
        for (Product product : products) {
            ProductResponseDto productResponseDto=this.modelMapper.map(product,ProductResponseDto.class);
            productResponseDtoList.add(productResponseDto);
        }

       return productResponseDtoList;
    }

    @Override
    public List<ProductResponseDto> getAllByCategoryId(long id) {

        List<Product> products=this.productDao.findAllByCategory_CategoryId(id);
        List<ProductResponseDto> productResponseDtoList=new ArrayList<>();
        for (Product product : products) {
            ProductResponseDto productResponseDto=this.modelMapper.map(product,ProductResponseDto.class);
            productResponseDtoList.add(productResponseDto);
        }
        return productResponseDtoList;
    }

}
