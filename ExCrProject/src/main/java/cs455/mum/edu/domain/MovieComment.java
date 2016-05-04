package cs455.mum.edu.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class MovieComment {
	@Id @GeneratedValue
 private int id;	
 private int rate;
 @Temporal(TemporalType.DATE)
 private Date date;
 private String comment;
 @ManyToOne
 private Movie movie;
 //comment
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public Movie getMovie() {
	return movie;
}
public void setMovie(Movie movie) {
	this.movie = movie;
}
 
}
