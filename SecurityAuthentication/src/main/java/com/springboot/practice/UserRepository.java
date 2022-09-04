package com.springboot.practice;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.practice.Product;

public interface UserRepository extends JpaRepository<Product,Long> {

}
