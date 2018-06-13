package pl.redblue.travelsouvenire.userpersonal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserPersonal, Integer> {
	UserPersonal findByNickname(String nickname);
}
