import java.util.LinkedList;
import java.util.List;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class LinkedLists {
    public static void main(String[] args) {

        List<Book> list = new LinkedList<Book>();

        Book b1 = new Book(101, "AAAAA", "aaaaa", "BPB", 8);
        Book b2 = new Book(102, "BBBBBB", "bbbbbb", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "CCCCCC", "ccccc", "Wiley", 6);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}

