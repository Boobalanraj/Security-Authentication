package com.springboot.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<Product> listAll(){
		return repo.findAll();
	}
	
	public void save(Product user) {
		repo.save(user);
	}
	
	public Product get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id); 
	}
}
