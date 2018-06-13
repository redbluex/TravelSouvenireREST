package pl.redblue.travelsouvenire.userpersonal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.redblue.travelsouvenire.places.SinglePlace;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<UserPersonal> getAllUser() {
		List<UserPersonal> users = new ArrayList<>();
		userRepository.findAll().forEach(users :: add);
		return users;
	}

	public void addUser(UserPersonal user) {
		userRepository.save(user);		
	}


	public UserPersonal getUserByName(String nickname) {
		return userRepository.findByNickname(nickname);
	}
	
	public Optional<UserPersonal> getUserById(Integer id) {
		return userRepository.findById(id);
	}

}
