package com.jap.bookstore;

public class Book {
    // Implement data hiding by declaring member variables private
    private int ISBNNo;
    private String bookName;
    private Author author;
    private String genre;
    private float price;

    // Declare getter and setter methods

	public Book () {
	}
 
    public int getISBNNO () {
		return ISBNNo;
	}

	public void setISBNNO(int ISBNNo) {
		this.ISBNNo=ISBNNo;
	}

	public String getBookName () {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName=bookName;
	}

	public Author getAuthor () {
		return author;
	}

	public void setAuthor(Author author) {
		this.author=author;
	}

	public String getGenre () {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre=genre;
	}

	public float getPrice () {
		return price;
	}

	public void setPrice(float price) {
		this.price=price;
	}

    // Method to display the details of a book
    public String displayBookDetails()
    {
        return (ISBNNo+"::"+bookName+"::"+author.getAuthorName()+"::"+genre+"::"+" $"+price);
    }

}
