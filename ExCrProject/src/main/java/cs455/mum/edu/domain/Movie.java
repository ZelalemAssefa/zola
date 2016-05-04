package cs455.mum.edu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Movie {
	@Id @GeneratedValue
	private int id;
   private  String title;
   @Lob
   private byte[] poster;
   private String summary;
   @Temporal(TemporalType.DATE)
   private Date year;
   @ManyToMany(mappedBy="movie")
   private List<Artist> artists=new ArrayList<Artist>();
   @OneToMany
   @Enumerated(EnumType.STRING)
   private List<Genre> genre=new ArrayList<Genre>();
   @Enumerated(EnumType.STRING)
   private MovieRating rate;
   @OneToMany(mappedBy="movie")
   private List<MovieComment> comment=new ArrayList<MovieComment>();
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public byte[] getPoster() {
	return poster;
}
public void setPoster(byte[] poster) {
	this.poster = poster;
}
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}
public Date getYear() {
	return year;
}
public void setYear(Date year) {
	this.year = year;
}
public List<Artist> getArtists() {
	return artists;
}
public void setArtists(List<Artist> artists) {
	this.artists = artists;
}
public List<Genre> getGenre() {
	return genre;
}
public void setGenre(List<Genre> genre) {
	this.genre = genre;
}

public MovieRating getRate() {
	return rate;
}
public void setRate(MovieRating rate) {
	this.rate = rate;
}
public List<MovieComment> getComment() {
	return comment;
}
public void setComment(List<MovieComment> comment) {
	this.comment = comment;
}
   
}
