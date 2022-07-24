package com.obsm.main;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.obsm.main.controller.UserController;

import com.obsm.main.model.User;
import com.obsm.main.repository.UserRepository;

@SpringBootTest
public class userController {

	@InjectMocks
	private UserController usercontroller;
	
	@Mock
	private UserRepository userrepository;
	
	
		
	@Test
	 public void testSavedUser() {
		
		User user=new User();
		user.setId((long) 1);
		user.setName("Adithya");
		user.setType("Admin");
		user.setPassword("adi");
		
	    when(userrepository.save(any(User.class))).thenReturn(user);
		User  myuser=userrepository.save(user);
	    assertThat(myuser.getName()).isNotNull();
	}
	
	@Test
	public void testIdUser() {
		
		
		User user=new User();
		user.setId((long) 1);
		user.setName("Adithya");
		user.setType("Admin");
		user.setPassword("adi");
		
		    when(userrepository.save(any(User.class))).thenReturn(user);
		    User  myuser=userrepository.save(user);
		    assertEquals(1,myuser.getId());
	    
	}
	
	@Test
	public void testWrongNameUser() {
		
		
		User user=new User();
		user.setId((long) 1);
		user.setName("Adithya");
		user.setType("Admin");
		user.setPassword("adi");
		
		    when(userrepository.save(any(User.class))).thenReturn(user);
		    User  myuser=userrepository.save(user);
		    assertEquals("Piyush",myuser.getName());
	    
	}
	
	
}
