public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("جادوی جاوا", "احمد رضایی");
        Book book2 = new Book("دنیای برنامه‌نویسی", "سارا محمدی");
        Book book3 = new Book("هوش مصنوعی", "مهدی حسینی");


        System.out.println("---- اطلاعات کتاب‌ها ----");
        book1.showInfo();
        book2.showInfo();
        book3.showInfo();

        System.out.println("\n---- عملیات امانت گرفتن ----");
        book1.borrow();
        book2.borrow();
        book1.borrow();


        System.out.println("\n---- وضعیت کتاب‌ها بعد از امانت ----");
        book1.showInfo();
        book2.showInfo();
        book3.showInfo();


        System.out.println("\n---- بازگرداندن کتاب‌ها ----");
        book1.giveBack();
        book3.giveBack();


        System.out.println("\n---- وضعیت نهایی کتاب‌ها ----");
        book1.showInfo();
        book2.showInfo();
        book3.showInfo();
    }
}
