package pl.redblue.travelsouvenire.photos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.redblue.travelsouvenire.userpersonal.UserPersonal;

@Service
public class PhotosService {
	@Autowired
	PhotosRepository photosRepository;
	
	public void sendImage(Photos photo) {
		photosRepository.save(photo);
	}
	
	public List<Photos> getAllPhotos(Integer id){
		List<Photos> photosList = new ArrayList<>();
		photosRepository.findBySinglePlaceIdsp(id).forEach(photosList :: add);
		return photosList;
	}
}
