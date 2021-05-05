import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;
    private HashMap<String, Integer> booksByGenre;

    public Library(int capacity){
        this.stock = new ArrayList<>();
        this.capacity = capacity;
        this.booksByGenre = new HashMap<>();
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addBookToStock(Book book){
        if (this.capacity > this.stockCount()) {
            this.stock.add(book);
        }

        String genre = book.getGenre();
        if(this.booksByGenre.containsKey(genre)){
            int bookCount = this.booksByGenre.get(genre);
            bookCount ++;
            this.booksByGenre.put(genre, bookCount);
        } else {
            this.booksByGenre.put(genre, 1);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Book removeFromStock() {
        this.stock.remove(0);
        return null;
    }


    public int getGenreCount(String genre) {
        return this.booksByGenre.get(genre);
    }
}
