public class Magazine extends Item implements Borrowable {

    private final int issueNumber;

    public Magazine(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }

    @Override
    public boolean borrow(Member member) {
        if (borrowed) return false;
        borrowed = true;
        borrowedBy = member;
        return true;
    }

    @Override
    public boolean isborrowed() {
        return borrowed;
    }

    @Override
    public boolean giveBack() {
        if (!borrowed) return false;
        borrowed = false;
        borrowedBy = null;
        return true;
    }

    @Override
    public boolean updateStatus() {
        System.out.println(
                getTitle() + " (Issue " + issueNumber + ") => " +
                        (borrowed ? "امانت داده شده به " + borrowedBy.getName() : "موجود")
        );
        return borrowed;
    }
}