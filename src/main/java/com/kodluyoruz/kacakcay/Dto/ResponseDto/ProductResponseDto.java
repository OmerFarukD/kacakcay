package com.kodluyoruz.kacakcay.Dto.ResponseDto;

import com.kodluyoruz.kacakcay.Dto.RequestDto.AddedProductRequestDto;
import lombok.Data;

@Data
public class ProductResponseDto {
    private String productName;
    private  double unitPrice;
    private int stock;
    private String categoryName;

}
