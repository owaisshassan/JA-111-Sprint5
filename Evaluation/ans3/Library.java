package sprint5EvaluationQues3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Library{

	
	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		
		
		books.add(new Book(1,"name1","aurhor1"));
		books.add(new Book(2,"name2","aurhor1"));
		books.add(new Book(3,"name1","aurhor1"));
		books.add(new Book(1,"name4","aurhor2"));
		books.add(new Book(2,"name4","aurhor2"));
		
		HashSet<Book> booksCollection = new HashSet<>(books);
		
		for(Book b:books) {
			booksCollection.add(b);
		}
		
		for(Book b1:booksCollection) {
//			Book b2=new Book(b1.getBookId(),b1.getBookName(),b1.getAuthor());
//			b2.toString();
			String res="Book{bookId="+b1.getBookId()+", bookName="+b1.getBookName()+", author="+b1.getAuthor()+"}";
			System.out.println(res);
		}
	}
	
}
