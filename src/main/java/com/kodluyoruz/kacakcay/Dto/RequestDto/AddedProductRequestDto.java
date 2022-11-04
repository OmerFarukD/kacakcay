package com.kodluyoruz.kacakcay.Dto.RequestDto;

import lombok.Data;

@Data
public class AddedProductRequestDto {

    private String productName;
    private int categoryId;
    private  double unitPrice;
    private int stock;


}
