package com.Food.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;        
import org.springframework.http.HttpStatus;                           // Represents HTTP status codes
import org.springframework.http.ResponseEntity;                       // Represents an HTTP response, including headers, body, and status
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.Food.entities.TableBooking;
import com.Food.entities.User;                                  
//import com.Food.service.TableBookingService;
import com.Food.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService ss;                                               
	
	@PostMapping("/createUser")                                        
	ResponseEntity<User> createUser(@RequestBody User user)
	{	
		return new ResponseEntity<User>(ss.createUser(user),HttpStatus.CREATED);
	}
	//@PostMapping("/createUser")
	//public ResponseEntity<User> createUser(@RequestBody UserRequest userRequest) {
	  //  User user = User.createFromId(userRequest.getUserId());
	    // Save the user to the database or perform other operations
	    //return ResponseEntity.ok(user);
	//}
	@GetMapping("/getAllUser")                                     
	List<User> getAllUser()
	{		
		return ss.getAllUser();
	}
	
	@GetMapping("/getUserById/{id}")                            
	User getUserById(@PathVariable int id)
	{		
		return ss.getUserById(id);
	}
	
	@PutMapping("/updateUser/{id}")                              
	User updateUser(@PathVariable int id,@RequestBody User user )
	{		
		return ss.updateUser(id, user);
	}
	
	@DeleteMapping("/deleteUserById/{id}")                   
	String deleteUserById(@PathVariable int id)
	{		
		return ss.deleteUserById(id);
	}
	 
	@DeleteMapping("/deleteUsers")                         
	String deleteUsers()
	{		
		return ss.deleteUsers();                         
	}
	
	
	

}
