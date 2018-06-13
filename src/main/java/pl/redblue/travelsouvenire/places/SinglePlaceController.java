package pl.redblue.travelsouvenire.places;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pl.redblue.travelsouvenire.userpersonal.UserPersonal;

@RestController
public class SinglePlaceController {
	
	@Autowired
	private SinglePlaceService singlePlaceService;
	
	@GetMapping("/users/{id}/places")
	public List<SinglePlace> places(@PathVariable Integer id){
		return singlePlaceService.getAllPlaces(id);
	}
	
	@GetMapping("/users/{userId}/places/{id}")
	public Optional<SinglePlace> getPlace( @PathVariable Integer id) {
		return singlePlaceService.getPlaceByID(id);
	}
	
	@PostMapping("/users/{userId}/places")
	public void addPlace(@RequestBody SinglePlace singlePlace, @PathVariable Integer userId) {
		singlePlace.setUserPersonal(new UserPersonal( userId, "", "", ""));
		singlePlaceService.addPlace(singlePlace);
	}
	
	
}
