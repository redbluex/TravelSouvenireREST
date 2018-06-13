package pl.redblue.travelsouvenire.userpersonal;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<UserPersonal> users(){
		return userService.getAllUser();
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody UserPersonal user) {
		userService.addUser(user);
	}
	
	@GetMapping("/users/{id}")
	public Optional<UserPersonal> getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}
	
	
	@GetMapping("/users/nick/{nickname}")
	public UserPersonal getUserByName(@PathVariable String nickname) {
		return userService.getUserByName(nickname);
	}
	
	
	

}
