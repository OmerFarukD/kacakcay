package com.kodluyoruz.kacakcay.Api;

import com.kodluyoruz.kacakcay.Dto.RequestDto.AddedProductRequestDto;
import com.kodluyoruz.kacakcay.Dto.ResponseDto.ProductResponseDto;
import com.kodluyoruz.kacakcay.Models.Product;
import com.kodluyoruz.kacakcay.Service.Abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductApi {

    private final ProductService productService;

    @PostMapping("/add")
    public String add(@RequestBody AddedProductRequestDto addedProductRequestDto){
        return this.productService.add(addedProductRequestDto);
    }


    @GetMapping("/getall")
    public List<ProductResponseDto> getAll(){
        return this.productService.getAll();
    }

}
