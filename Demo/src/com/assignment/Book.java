package com.assignment;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="book")
public class Book {

	@Id
	@Column(name="bookid")
	private int bookid;
	@Column(name="bookname")
	private String bookname;
	@Column(name="publisheddate")
	private Date publisheddate;
	@Column(name="authorname")
	private String authorname;
	@Column(name="edition")
	private int version;
	
	public Book(){};
	public Book(int bookid, String bookname, String publisheddate, String authorname, int version) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisheddate = Date.valueOf(publisheddate);
		this.authorname = authorname;
		this.version = version;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Date getPublisheddate() {
		return publisheddate;
	}
	public void setPublisheddate(String publisheddate) {
		this.publisheddate = Date.valueOf(publisheddate);
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	

}
