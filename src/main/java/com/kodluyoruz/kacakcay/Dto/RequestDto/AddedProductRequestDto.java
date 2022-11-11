package com.kodluyoruz.kacakcay.Dto.RequestDto;

import com.kodluyoruz.kacakcay.Annotations.ProductsAnnotations.AbdulMuttalibAbininKuralları;
import com.kodluyoruz.kacakcay.Annotations.ProductsAnnotations.ZekininKuralları;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;


// Gitsin veritabanına aynı isimde bir ürün varsa gitsin desinki aynı üründen bir tane daha var başka bir ürün ekleyin.



@Data
@ZekininKuralları
public class AddedProductRequestDto {

    @NotNull
    @Length(min = 2,max = 100)


    @AbdulMuttalibAbininKuralları
    private String productName;


    private int categoryId;




    private  double unitPrice;




     private int stock;


}

