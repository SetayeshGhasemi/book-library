import java.util.ArrayList;
import java.util.List;

public class Member extends BaseEntity {

    private final List<Book> books = new ArrayList<>();
    private final List<Magazine> magazines = new ArrayList<>();



    public Member(String name) {
        super(name);
    }

    public BorrowStatus borrowBook(Book book) {
        if (!book.isborrowed() && book.borrow(this)) {
            books.add(book);
            return BorrowStatus.SUCCESS;
        }
        return BorrowStatus.ITEM_NOT_AVAILABLE;
    }

    public BorrowStatus borrowMagazine(Magazine magazine) {
        if (!magazine.isborrowed() && magazine.borrow(this)) {
            magazines.add(magazine);
            return BorrowStatus.SUCCESS;
        }
        return BorrowStatus.ITEM_NOT_AVAILABLE;
    }


    public boolean returnBook(int bookId) {

        Book bookToReturn = null;
        for (Book book : books) {

            if (book.getId() == bookId) {
                bookToReturn = book;
                break;
            }
        }


        if (bookToReturn == null) {
            return false;
        }


        if (bookToReturn.giveBack()) {
            books.remove(bookToReturn);
            return true;
        }

        return false;
    }

    public boolean returnMagazine(Magazine magazine) {
        if (!magazines.contains(magazine)) return false;

        if (magazine.giveBack()) {
            magazines.remove(magazine);
            return true;
        }

        return false;
    }

    public void updateStatus() {
        System.out.println("وضعیت امانت‌های " + getName() + ":");

        if (books.isEmpty() && magazines.isEmpty()) {
            System.out.println("هیچ آیتمی امانت گرفته نشده");
        }

        for (Book book : books) {
            book.updateStatus();
        }

        for (Magazine magazine : magazines) {
            magazine.updateStatus();
        }

    }


    public List<Book> getBooks() {
        return books;

    }
}