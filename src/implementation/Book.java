package implementation;

public class Book {
	
	private String name;
	private int price;

	public Book(String name, int price) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public String getName() {
		return this.name;
	}
}
