package pl.redblue.travelsouvenire.photos;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import pl.redblue.travelsouvenire.places.SinglePlace;

@RestController
public class PhotosController {
	@Autowired
	PhotosService photosService;
	
	@RequestMapping(value="/users/{userId}/places/{singlePlaceid}/upload", method=RequestMethod.POST)
    public void handleFileUpload( 
            @RequestParam("file") MultipartFile file, @RequestParam("namePh") String namePh,
            @PathVariable Integer singlePlaceid){
        if (!file.isEmpty()) {
            try {
            	
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream = 
                        new BufferedOutputStream(new FileOutputStream(new File("uploads\\"+namePh + "uploaded.jpg")));
                stream.write(bytes);
                stream.close();
                
                Photos photos = new Photos(namePh, singlePlaceid);
                photosService.sendImage(photos);
            } catch (Exception e) {
                
            }
        } else {
            
        }
    }
	
	@GetMapping("/users/{userId}/places/{singlePlaceid}/upload")
	public List<Photos> getAllPhotos(@PathVariable Integer singlePlaceid){
		return photosService.getAllPhotos(singlePlaceid);
	}
	
	@RequestMapping(value="/image", method=RequestMethod.POST)
    public void imageUpload( 
            @RequestParam("file") MultipartFile file){
        if (!file.isEmpty()) {
            try {
            	
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream = 
                        new BufferedOutputStream(new FileOutputStream(new File("uploads\\"+ "plik" + "uploaded.jpg")));
                stream.write(bytes);
                stream.close();
                
                
            } catch (Exception e) {
                
            }
        } else {
            
        }
    }
	
}
