package pl.redblue.travelsouvenire.photos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotosRepository extends JpaRepository<Photos, Integer>  {
	List<Photos>findBySinglePlaceIdsp(Integer id);
}
