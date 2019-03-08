package com.example.demo.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createNewUser(User user) {
	
		userRepository.save(user);
		return user;
	}

	@Override
	public User getUser(Long id) {
	
		return userRepository.getOne(id);
	}

	@Override
	public Page<User> getUsers(Pageable pageable) {
		
		return userRepository.findAll(pageable);
	}

}
