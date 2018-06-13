package pl.redblue.travelsouvenire.photos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import pl.redblue.travelsouvenire.places.SinglePlace;


@Entity
public class Photos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer photoId;
	private String photoName;
	@ManyToOne
	private SinglePlace singlePlace;
	
	public Photos() {
		
	}
	public Photos(String photoName, Integer singlePlaceId) {
		super();
		this.photoName = photoName;
		this.singlePlace = new SinglePlace( singlePlaceId, "", "","");
	}
	
	
	
	public SinglePlace getSinglePlace() {
		return singlePlace;
	}
	public void setSinglePlace(SinglePlace singlePlace) {
		this.singlePlace = singlePlace;
	}
	public Photos(Integer photoId, String photoName) {
		super();
		this.photoId = photoId;
		this.photoName = photoName;
	}
	public Integer getPhotoId() {
		return photoId;
	}
	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	
	
}
