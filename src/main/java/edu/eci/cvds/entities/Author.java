package edu.eci.cvds.entities;

import java.util.Date;

/**
 * Clase que representaa un autor
 */
public class Author {

	private int id;
	private String name;
	private String citizenship;
	private Date birthdate;

	public Author() {
		super();
	}

	public Author(int id, String name, String citizenship, Date birthdate) {
		this.id = id;
		this.name = name;
		this.citizenship = citizenship;
		this.birthdate = birthdate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", citizenship=" + citizenship + ", birthdate=" + birthdate + "]";
	}
}
