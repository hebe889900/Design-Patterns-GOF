package Behavior.Strategy;

import java.util.Iterator;
import java.util.Vector;

public class Strategy {
	public Iterator searchByAuthor(String name,
			 Sorter sorter) {
			 Vector results = new Vector();
			 Vector _theBooks = null;
			for (int i = 0; i < _theBooks.size(); i++) {
			 BookInfo bookInfo =
			 (BookInfo) _theBooks.elementAt(i);
			 Book book = bookInfo.getBook();
			 String authorLastName = book.getLastName();
			 String otherAuthors = book.getOtherAuthors();
			 if ((authorLastName.indexOf(name) != -1)
			 || (otherAuthors != null &&
			 otherAuthors.indexOf(name) != -1)) {
			 results.addElement(book);
			 }
			 }
			 sorter.sort(results);
			 return new SearchResultIterator(results);
			}
}
