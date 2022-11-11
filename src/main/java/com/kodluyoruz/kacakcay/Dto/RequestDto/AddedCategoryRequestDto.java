package com.kodluyoruz.kacakcay.Dto.RequestDto;

import com.kodluyoruz.kacakcay.Annotations.CategoryAnnotations.SevgininKurallari;
import lombok.Data;

@Data
public class AddedCategoryRequestDto {


    @SevgininKurallari
    private String  categoryName;
}
