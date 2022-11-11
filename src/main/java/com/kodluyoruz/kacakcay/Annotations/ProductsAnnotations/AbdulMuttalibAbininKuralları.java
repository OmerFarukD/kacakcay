package com.kodluyoruz.kacakcay.Annotations.ProductsAnnotations;


import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;



@Target({  FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = {ConstraintClass.class })
public @interface AbdulMuttalibAbininKuralları {

    String message() default "Aynı üründen var başka ürün ekleyin.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };



}
