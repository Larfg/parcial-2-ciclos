package edu.eci.cvds.entities;

import java.util.Date;

/**
 * Clase que representa un programa
 */
public class Review {
	private int id;
	private String title;
	private Date date;
	private String comment;
	private short rating;
	private int decanaturaId;

	public Review() {
		super();
	}

	public Review(int id, String title, Date date, String comment, short rating, int decanaturaId) {
		this.id = id;
		this.title = title;
		this.date = date;
		this.comment = comment;
		this.rating = rating;
		this.decanaturaId = decanaturaId;
	}

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

	public short getRating() {
		return rating;
	}

	public void setRating(short rating) {
		this.rating = rating;
	}

	public int getDecanaturaId() {
		return decanaturaId;
	}

	public void setDecanaturaId(int decanaturaId) {
		this.decanaturaId = decanaturaId;
	}

	@Override
	public String toString() {
		return "Review{" +
				"id=" + id +
				", title='" + title + '\'' +
				", date=" + date +
				", comment='" + comment + '\'' +
				", rating=" + rating +
				", decanaturaId=" + decanaturaId +
				'}';
	}
}
