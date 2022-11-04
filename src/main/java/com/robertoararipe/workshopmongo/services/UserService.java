package com.robertoararipe.workshopmongo.services;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robertoararipe.workshopmongo.domain.User;
import com.robertoararipe.workshopmongo.repositiry.UserRepository;
import com.robertoararipe.workshopmongo.services.exception.objectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new objectNotFoundException("object not found."));
		}
	}


