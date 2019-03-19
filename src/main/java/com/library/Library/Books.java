package com.library.Library;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "Books")
public class Books implements Serializable {

	@Id
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Book_Name", nullable = false)
	private String book_Name;

	@OneToOne(cascade = CascadeType.ALL)
	private Author author_detials;

	public Books() {
	}

	public Books(Integer id, String book_Name, Author author_detials) {
		super();
		this.id = id;
		this.book_Name = book_Name;
		this.author_detials = author_detials;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBook_Name() {
		return book_Name;
	}

	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}

	public Author getAuthor_detials() {
		return author_detials;
	}

	public void setAuthor_detials(Author author_detials) {
		this.author_detials = author_detials;
	}

}
