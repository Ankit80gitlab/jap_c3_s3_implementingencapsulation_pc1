package com.jap.bookstore;

public class BookStoreImpl {
    public static void main(String[] args) {

		BookStoreImpl obj =new BookStoreImpl();
        // Declare and initialize author, book and bookstore objects
        // Use the get and set methods to set values to the variables

		Author obj1 =new Author();
		obj1.setAuthorName("RD Burman");
		obj1.setAuthorPenName("Burman da");

		Book obj2 =new Book();
		obj2.setISBNNO(461);
        obj2.setBookName("Music");
		obj2.setAuthor(obj1);
		obj2.setGenre("Fiction");
		obj2.setPrice(250.0f);

		Book [] list=new Book[1];
		list[0]=obj2;
		
		Bookstore obj3 = new Bookstore();
		obj3.setBookStoreName("Bollywood");
		obj3.setBookStoreRegistrationId("B101");
		obj3.setBooks(list);


        //Display book details before discount is calculated
        System.out.println("The book details before discount : ");

		System.out.println(obj2);

        //Calculate discount on the books by calling the methods
		obj3.calculateDiscount(obj2, 25.0f);

        //Display book details after discount is calculated
        System.out.println("The book details after discount : ");

		System.out.println(obj3);

        }

}
