package com.example.demo.user;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.ObjectReturnResponse;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping
	public ObjectReturnResponse<User> createUser(@Valid @RequestBody User user){
		
		User createdUser = userService.createNewUser(user);
		
		return new ObjectReturnResponse<User>("0","Success",createdUser);
	}
	
	@GetMapping
	public Page<User> getUsers(Pageable pageable){
		
		return userService.getUsers(pageable);
	}
	
	@GetMapping("/{id}")
	public ObjectReturnResponse getUser(@PathVariable Long id){
		
		User user = userService.getUser(id);
		
		return new ObjectReturnResponse<User>("0","Success",user);
	}
}
