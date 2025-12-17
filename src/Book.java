public class Book extends Item {
    private static int counter = 1;
    private int id;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        super(title);
        this.id = counter++;
        this.author = author;
        this.isBorrowed = false;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        if (isBorrowed) {
            System.out.println(getTitle() + " قبلاً امانت داده شده است.");
            return;
        }
        isBorrowed = true;
        System.out.println(getTitle() + " امانت داده شد.");
    }

    public void giveBack() {
        if (!isBorrowed) {
            System.out.println(getTitle() + " در کتابخانه موجود است.");
            return;
        }
        isBorrowed = false;
        System.out.println(getTitle() + " بازگردانده شد.");
    }

    @Override
    public void showInfo() {
        System.out.println(
                "ID: " + id +
                        " | Book: " + getTitle() +
                        " | Author: " + author +
                        " | " + (isBorrowed ? "امانت داده شده" : "موجود")
        );
    }
}