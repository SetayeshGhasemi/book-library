import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Member {
    private String name;
    private Map<Integer, Book> myBooks;

    public Member(String name) {
        this.name = name;
        this.myBooks = new HashMap<>();
    }


    public void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("عنوان کتاب: ");
        String title = scanner.nextLine();

        System.out.print("نویسنده: ");
        String author = scanner.nextLine();

        Book book = new Book(title, author);
        myBooks.put(book.getId(), book);

        System.out.println("کتاب اضافه شد ");
    }


    public void borrowBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID کتاب برای امانت گرفتن: ");
        int id = scanner.nextInt();

        Book book = myBooks.get(id);

        if (book != null) {
            book.borrow();
        } else {
            System.out.println("کتاب با این ID پیدا نشد");
        }
    }

    public void showBooks() {
        System.out.println("کتاب‌های عضو " + name + ":");
        for (Book book : myBooks.values()) {
            book.showInfo();
        }
    }
}
