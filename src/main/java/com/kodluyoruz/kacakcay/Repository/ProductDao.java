package com.kodluyoruz.kacakcay.Repository;
import com.kodluyoruz.kacakcay.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;


public interface ProductDao extends JpaRepository<Product,Integer> {

    Product findByProductId(int id);

    Product findByProductName(String prodName);

    List<Product> findAllByCategory_CategoryId(long category_categoryId);

}
