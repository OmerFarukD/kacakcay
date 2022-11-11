package com.kodluyoruz.kacakcay.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
public class Product {

   /* public  Product(){

    }*/
    // Validation Rules


    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "stock")
    private int stock;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
