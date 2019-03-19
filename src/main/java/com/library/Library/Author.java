package com.library.Library;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author implements Serializable {

	@Id
	private Integer author_id;

	private String author_name;

	public Author() {

	}

	public Author(Integer author_id, String author_name) {
		super();
		this.author_id = author_id;
		this.author_name = author_name;
	}

	public Integer getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(Integer author_id) {
		this.author_id = author_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

}
