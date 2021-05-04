import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<>();
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

    public Book removeFromStock() {
        this.stock.remove(0);
        return null;
    }

    public static void main(String[] args) {

        HashMap<String, Integer> genres = new HashMap<String, Integer>();
        genres.put("Sci-fi", 20);
        genres.put("Romance", 15);
        genres.put("Mystery", 17);

        System.out.println(genres);
        System.out.println(genres.get("Mystery"));
    }
}
