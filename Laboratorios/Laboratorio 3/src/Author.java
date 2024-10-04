import java.util.ArrayList;
public class Author {
    private String name;
    private ArrayList<Book> books =new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void getBooks(){
        for(Book book:books){
            System.out.println(" Title: " + book.getTitle() + ", Author: " + getName() + ", Price: " + book.getPrice());
        }
    }
    public void addBook(String title,double price){
        Book book = new Book(title,this,price);
        books.add(book);
    }

    
    
}
