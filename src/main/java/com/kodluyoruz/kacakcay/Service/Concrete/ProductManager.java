package com.kodluyoruz.kacakcay.Service.Concrete;


import com.kodluyoruz.kacakcay.Dto.RequestDto.AddedProductRequestDto;
import com.kodluyoruz.kacakcay.Dto.ResponseDto.ProductResponseDto;
import com.kodluyoruz.kacakcay.Models.Product;
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


    @Override
    public String add(AddedProductRequestDto addedProductRequestDto) {

   /*     Product product=new Product();
        product.setProductName(addedProductRequestDto.getProductName());
        product.setStock(addedProductRequestDto.getStock());
        product.setUnitPrice(addedProductRequestDto.getUnitPrice());
*/

        Product product=this.modelMapper.map(addedProductRequestDto,Product.class);

        Product product1=this.productDao.findByProductName(addedProductRequestDto.getProductName());
        if (product1!=null){
            return "Ürün Zaten ekli başka ürün ekleyiniz.";
        }else{
            this.productDao.save(product);
            return "Ürün eklendi.";
        }
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

}
