package cs455.mum.edu.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="artiystRole")
public abstract class Artist {
	@Id@GeneratedValue
	private int id;
	private String name;
	private String placeOfBirth;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	@Lob
	private byte[] picture;
	private String bio;
	@ManyToMany
	private List<Movie> movie;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public byte[] getPicture() {
		return picture;
	}
	
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	public List<Movie> getMovie() {
		return movie;
	}
	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}
	

}
