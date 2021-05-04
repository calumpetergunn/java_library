import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void addBookToCollection(Book book1) {
        this.collection.add(book1);
    }
//
    public void addedToCollectionFromLibrary(Library library){
        Book book = library.removeFromStock();
        this.collection.add(book);
        }

}
