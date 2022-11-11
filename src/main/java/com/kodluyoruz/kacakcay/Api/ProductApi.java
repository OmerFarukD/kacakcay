package com.kodluyoruz.kacakcay.Api;

import com.kodluyoruz.kacakcay.Dto.RequestDto.AddedProductRequestDto;
import com.kodluyoruz.kacakcay.Dto.ResponseDto.ProductResponseDto;

import com.kodluyoruz.kacakcay.Service.Abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductApi {

    private final ProductService productService;

    @PostMapping("/add")
    public String add(@Valid @RequestBody AddedProductRequestDto addedProductRequestDto){
        return this.productService.add(addedProductRequestDto);
    }

    @GetMapping("/getall")
    public List<ProductResponseDto> getAll(){
        return this.productService.getAll();
    }

    @GetMapping("/getallbyid")
    public List<ProductResponseDto> getAllByCategoryId(@RequestParam long id){
        return this.productService.getAllByCategoryId(id);
    }


}
