package cs544.exercise19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cs544.sample.NoSuchResourceException;
import org.springframework.security.access.annotation.Secured;

public class BookDao implements IBookDao {
	private static int idCount = 1;
	private Map<Integer, Book> books = new HashMap<>();
	
	public BookDao() {
		add(new Book());
		add(new Book());
	}
	
	@Override
	public List<Book> getAll() {
		return new ArrayList<Book>(books.values());
	}
	
	@Override
	@Secured("hasAuthority(ROLE_ADMIN)")
	public void add(Book book) {
		book.setId(idCount);
		books.put(idCount, book);
		idCount++;
	}
	
	@Override
	@Secured("hasAuthority(ROLE_ADMIN)")
	public Book get(int id) {
		Book result = books.get(id);
		
		if (result == null) {
			throw new NoSuchResourceException("Book", id);
		}
		
		return result;
	}
	
	@Override
	@Secured("hasAuthority(ROLE_ADMIN)")
	public void update(int bookId, Book book) {
		books.put(bookId, book);
	}
	
	@Override
	@Secured("hasAuthority(ROLE_ADMIN)")
	public void delete(int bookId) {
		Book removed = books.remove(bookId);
		if (removed == null) {
			throw new NoSuchResourceException("Book", bookId);
		}
	}
}
