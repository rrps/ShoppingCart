package implementation;

import java.util.LinkedList;

public class ShoppingCart {
	
	private int productsCount;
	private LinkedList<Book> books;
	private int totalValue;
	
	public ShoppingCart(){
	// TODO Auto-generated method stub
		productsCount = 0;
		totalValue=0;
		books=new LinkedList<Book>();
	}

	public int getProductsCount() {
		// TODO Auto-generated method stub
		return productsCount;
	}

	public void addBook(Book book) {
		// TODO Auto-generated method stub
		books.add(book);
		productsCount++;
		totalValue+=book.getPrice();
	}

	public int getTotalValue() {
		// TODO Auto-generated method stub
		return totalValue;
	}

	public LinkedList<Book> getBooks() {
		// TODO Auto-generated method stub
		return books;
	}
}
