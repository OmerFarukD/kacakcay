package com.kodluyoruz.kacakcay.Repository;
import com.kodluyoruz.kacakcay.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductDao extends JpaRepository<Product,Integer> {

    Product findByProductId(int id);

    Product findByProductName(String prodName);

}
