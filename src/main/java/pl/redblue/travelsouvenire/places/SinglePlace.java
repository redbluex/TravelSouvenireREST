package pl.redblue.travelsouvenire.places;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import pl.redblue.travelsouvenire.userpersonal.UserPersonal;

@Entity
public class SinglePlace {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idsp;
	private String city;
	private String country;
	private String description;
	@ManyToOne
	private UserPersonal userPersonal;
	
	
	public SinglePlace(){
		
	}
	public SinglePlace(String city, String country, String description,  Integer userPersonalId){
		this.city = city;
		this.country = country;
		this.description = description;
		this.userPersonal = new UserPersonal( userPersonalId, "", "","");
	}
	public SinglePlace(Integer idsp, String city, String country, String description){
		this.idsp = idsp;
		this.city = city;
		this.country = country;
		this.description = description;
	}
	
	
	
	public UserPersonal getUserPersonal() {
		return userPersonal;
	}
	public void setUserPersonal(UserPersonal userPersonal) {
		this.userPersonal = userPersonal;
	}
	public Integer getIdsp() {
		return idsp;
	}
	public void setIdsp(Integer idsp) {
		this.idsp = idsp;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
