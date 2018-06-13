package pl.redblue.travelsouvenire.places;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SinglePlaceService {
	@Autowired
	private SinglePlaceRepository singlePlaceRepository;
	
	public List<SinglePlace> getAllPlaces(Integer id){
		List<SinglePlace> places = new ArrayList<>();
		singlePlaceRepository.findByUserPersonalId(id).forEach(places :: add);
		return places;
	}
	
	public void addPlace(SinglePlace place) {
		singlePlaceRepository.save(place);		
	}
	
	public Optional<SinglePlace> getPlaceByID(Integer id) {
		return singlePlaceRepository.findById(id);
	}
}
