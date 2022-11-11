package com.kodluyoruz.kacakcay.Annotations.CategoryAnnotations;

import com.kodluyoruz.kacakcay.Models.Category;
import com.kodluyoruz.kacakcay.Repository.CategoryDao;
import lombok.RequiredArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

@RequiredArgsConstructor
public class CategoryValidatorRules implements ConstraintValidator<SevgininKurallari,String> {

    private final CategoryDao categoryDao;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        Category category=this.categoryDao.getByCategoryName(value);
        if (category!=null){
            return false;
        }
        return true;
    }
}
