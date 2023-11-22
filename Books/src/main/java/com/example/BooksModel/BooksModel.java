package com.example.BooksModel;

import javax.persistence.Entity;



import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;



@Entity
@Table(name="BookDet")
public class BooksModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long bookid;
	private int serialno;
	private String booktitle;
	private String author;
	
	public long getBookid() {
		return bookid;
	}
	public void setBookid(long bookid) {
		this.bookid = bookid;
	}
	public int getSerialno() {
		return serialno;
	}
	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	@Override
	public String toString() {
		return "BooksModel [bookid=" + bookid + ", serialno=" + serialno + ", booktitle=" + booktitle + ", author="
				+ author + "]";
	}
	
	 public BooksModel() {
	        // Empty constructor
	    }
	public BooksModel(long bookid, int serialno, String booktitle, String author) {
		super();
		this.bookid = bookid;
		this.serialno = serialno;
		this.booktitle = booktitle;
		this.author = author;
	}
}




