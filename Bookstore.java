package com.jap.bookstore;

public class Bookstore {
    // Implement data hiding by declaring member variables private
    private String bookStoreName;
    private String bookStoreRegistrationId;
    private Book[] books;

    //Declare getter and setter methods

	public Bookstore () {
	}

	public String getBookStoreName() {
		return bookStoreName;
	}

	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName=bookStoreName;
	}

	public String getBookStoreRegistrationId() {
		return bookStoreRegistrationId;
	}

	public void setBookStoreRegistrationId(String bookStoreRegistrationId) {
		this.bookStoreRegistrationId=bookStoreRegistrationId;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books=books;
	}

    // Function to calculate the discount for a genre of books
    public float calculateDiscount(Book book,float discountPercentage){

		float discount=0.0f;

		if(book.getGenre().equalsIgnoreCase("Fiction"))
		{
			discount=book.getPrice()-book.getPrice()*discountPercentage/100;
		}
		else
		{
			discount=book.getPrice();
		}
        return discount;
    }
}
