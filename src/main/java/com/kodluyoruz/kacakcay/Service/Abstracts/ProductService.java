package com.kodluyoruz.kacakcay.Service.Abstracts;

import com.kodluyoruz.kacakcay.Dto.RequestDto.AddedProductRequestDto;
import com.kodluyoruz.kacakcay.Dto.ResponseDto.ProductResponseDto;


import java.util.List;

public interface ProductService {
    String add(AddedProductRequestDto addedProductRequestDto);
    void delete(int id);
    List<ProductResponseDto> getAll();

}
