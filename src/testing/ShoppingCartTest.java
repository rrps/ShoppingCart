package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import implementation.ShoppingCart;
import implementation.Book;

public class ShoppingCartTest {

	private ShoppingCart target=null;
	private Book book=null;
	@Before
	public void setUp() throws Exception {
		target=new ShoppingCart();
	}

	@Test
	public void test_cart_emptyCart() {
		int productsCountFixture = 0;
		int totalValueFixture=0;
		assertTrue(productsCountFixture==target.getProductsCount());
		assertTrue(totalValueFixture==target.getTotalValue());
	}
	
	@Test
	public void test_cart_oneUnitAdded() {
	
	book =new Book("Java Book",127);
	target.addBook(book);
	int productsCountFixture = 1;
	int totalValueFixture=127;
	
	assertTrue(productsCountFixture==target.getProductsCount());
	assertTrue(totalValueFixture==target.getTotalValue());
	
	}
	
	@Test
	public void test_cart_twoUnitAdded() {
	
	book =new Book("Java Book",127);
	target.addBook(book);
	book =new Book("Web design Book",100);
	target.addBook(book);
	int productsCountFixture = 0;
	int totalValueFixture=0;
	
	for(Book i:target.getBooks()) {
		totalValueFixture+=i.getPrice();
		productsCountFixture++;
	}
	
	assertTrue(productsCountFixture==target.getProductsCount());
	assertTrue(totalValueFixture==target.getTotalValue());
	
	}

}
