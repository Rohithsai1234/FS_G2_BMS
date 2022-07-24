package com.obsm.main.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obsm.main.exception.UserNotFound;
import com.obsm.main.model.User;
import com.obsm.main.repository.UserRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "users")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/get")
	public List<User> getUsers() {
		
		return userRepository.findAll();
	}
	
	@PostMapping("/add")
	public void createUser(@RequestBody User user) throws UserNotFound {
		try {
			if (user != null) {		
		          userRepository.save(user);
			} else throw new UserNotFound("Nothing to add");
		}catch(UserNotFound usernotfound){
			System.out.println(usernotfound);
		}
	}
	
	
	@DeleteMapping(path= {"/{id}"})
	public User deleteUser(@PathVariable("id") long id) throws UserNotFound {
		try{
			User user = userRepository.getReferenceById(id);
			if(userRepository.existsById(id)){
		    userRepository.deleteById(id);
		    return user;
			}
			else {
				throw new UserNotFound("User is Null");
			}
		}catch(UserNotFound adminnotfound) {
			System.out.println(adminnotfound);
			return null;
		}
		
	}

	
}