import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Book book1;
    Library library;

    @Before
    public void setUp(){
        borrower = new Borrower();
        book = new Book("The Dispossesed", "Ursula LeGuin", "Sci-fi");
        book1 =  new Book("1984", "George Orwell", "Sci-fi");
        library = new Library(4);
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBookToCollection(){
        borrower.addBookToCollection(book1);
        assertEquals(1, borrower.collectionCount());
    }

    @Test
    public void canAddToCollectionAndTake(){
        library.addBookToStock(book1);
        library.addBookToStock(book1);
        library.addBookToStock(book1);
        borrower.addedToCollectionFromLibrary(library);
        assertEquals(1, borrower.collectionCount());
        assertEquals(2, library.stockCount());
    }
}
