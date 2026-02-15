public class Student extends Member {

    private final int memberId;

    public Student(String name, int memberId) {
        super(name);
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }
}