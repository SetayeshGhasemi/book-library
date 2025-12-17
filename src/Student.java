import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Map<Integer, Book> myBooks = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        myBooks.put(book.getId(), book);
    }

    public void showBooks() {
        System.out.println("کتاب‌های دانشجو " + name + ":");
        for (Book book : myBooks.values()) {
            System.out.println("ID: " + book.getId() + " | Title: " + book.getTitle() +
                    " | Status: " + (book.isBorrowed() ? "امانت داده شده" : "موجود"));
        }
    }
}