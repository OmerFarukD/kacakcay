package com.kodluyoruz.kacakcay.Annotations.ProductsAnnotations;

import com.kodluyoruz.kacakcay.Models.Product;
import com.kodluyoruz.kacakcay.Repository.ProductDao;
import lombok.RequiredArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@RequiredArgsConstructor
public class ConstraintClass implements ConstraintValidator<AbdulMuttalibAbininKuralları,String> {

    private final ProductDao productDao;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Product product=this.productDao.findByProductName(value);
        if (product!=null){
            return false;
        }
        return true;
    }

}
