import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp(){
        book = new Book("The Dispossesed", "Ursula LeGuin", "Sci-fi");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("The Dispossesed", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Ursula LeGuin", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Sci-fi", book.getGenre());
    }

}
