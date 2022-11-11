package com.kodluyoruz.kacakcay.Annotations.ProductsAnnotations;

import com.kodluyoruz.kacakcay.Dto.RequestDto.AddedProductRequestDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
// unitPrice 20 den küçük olunca hata versin
// stock 20 den büyük olunca hata versin.
public class ZekininKurallariRules implements ConstraintValidator<ZekininKuralları, AddedProductRequestDto> {
    @Override
    public boolean isValid(AddedProductRequestDto value, ConstraintValidatorContext context){
        if (value.getUnitPrice()<20 || value.getStock()>20 ){
            return false;
        }
        return true;
    }
}
