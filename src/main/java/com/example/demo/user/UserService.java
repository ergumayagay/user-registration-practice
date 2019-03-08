package com.example.demo.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
	
	public User createNewUser(User user);
	
	public User getUser(Long id);
	
	public Page<User> getUsers(Pageable pageable);

}
