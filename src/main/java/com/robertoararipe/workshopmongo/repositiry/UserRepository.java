package com.robertoararipe.workshopmongo.repositiry;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.robertoararipe.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	

}
