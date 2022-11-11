package com.kodluyoruz.kacakcay.Annotations.CategoryAnnotations;


import com.kodluyoruz.kacakcay.Annotations.ProductsAnnotations.ConstraintClass;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;



@Target({  FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = {CategoryValidatorRules.class })
public @interface SevgininKurallari {

    String message() default "Aynı Kategori var başka Kategori ekleyin.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };



}
