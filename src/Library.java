import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("کتاب‌های کتابخانه:");
        for (Book b : books) {
            System.out.println(
                    b.getTitle() + " - " +
                            (b.isBorrowed() ? "امانت داده شده" : "موجود")
            );
        }
    }

    public Book findBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
}