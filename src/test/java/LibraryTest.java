import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Book book2;

    @Before
    public void setUp(){
        library = new Library(4);
        book = new Book("The Dispossesed", "Ursula LeGuin", "Sci-fi");
        book1 =  new Book("1984", "George Orwell", "Sci-fi");
        book2 = new Book("In Cold Blood", "Truman Capote", "Crime");
    }

    @Test
    public void stockCountStartsAtZero(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(4, library.getCapacity());
    }

    @Test
    public void canAddBookToStock(){
        library.addBookToStock(book);
        library.addBookToStock(book1);
        library.addBookToStock(book2);
        assertEquals(3, library.stockCount());
    }

    @Test
    public void cantAddBookToStock(){
        library.addBookToStock(book);
        library.addBookToStock(book1);
        library.addBookToStock(book2);
        library.addBookToStock(book2);
        library.addBookToStock(book2);
        assertEquals(4, library.stockCount());
    }

    @Test
    public void canRemoveFromStock(){
        library.addBookToStock(book);
        library.addBookToStock(book1);
        library.addBookToStock(book2);
        library.removeFromStock();
        assertEquals(2, library.stockCount());

    }

    @Test
    public void canIncreaseGenreCount(){
        library.addBookToStock(book);
        library.addBookToStock(book1);
        library.addBookToStock(book2);

        assertEquals(2, library.getGenreCount("Sci-fi"));
        assertEquals(1, library.getGenreCount("Crime"));
    }



}
