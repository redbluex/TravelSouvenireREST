package pl.redblue.travelsouvenire.places;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SinglePlaceRepository extends JpaRepository<SinglePlace, Integer> {
		List<SinglePlace> findByUserPersonalId(Integer id);
}
