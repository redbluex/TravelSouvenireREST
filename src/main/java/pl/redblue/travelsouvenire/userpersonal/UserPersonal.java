package pl.redblue.travelsouvenire.userpersonal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserPersonal {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="nickname", unique=true)
	private String nickname;
	@Column(name="password")
	private String password;
	@Column(name="description")
	private String description;
	
	public UserPersonal() {
		
	}
	
	public UserPersonal(Integer id, String nickname, String password, String description) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.password = password;
		this.description = description;
	}
	public UserPersonal( String nickname, String password, String description) {
		super();
		this.nickname = nickname;
		this.password = password;
		this.description = description;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
