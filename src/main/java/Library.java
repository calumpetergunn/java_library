import java.sql.Array;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addBookToStock(Book book){
        if (this.capacity > this.stockCount()) {
            this.stock.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }
}
