package com.kodluyoruz.kacakcay.Annotations.ProductsAnnotations;


import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;



@Target({  TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = {ZekininKurallariRules.class })
public @interface ZekininKuralları {

    String message() default "Zekinin kurallarından geçemedi.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };



}
