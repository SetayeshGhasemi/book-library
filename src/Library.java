import java.util.ArrayList;
import java.util.List;

public class Library {

    private final String name;
    private final List<Item> items = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public boolean addItem(Item item) {
        return items.add(item);
    }

    public boolean addMember(Member member) {
        return members.add(member);
    }


    public List<Item> getAvailableItems() {
        List<Item> available = new ArrayList<>();

        for (Item item : items) {
            if (!item.borrowed) {
                available.add(item);
            }
        }
        return available;
    }

    public String getSummary() {
        return name +
                " | آیتم‌ها: " + items.size() +
                " | اعضا: " + members.size();
    }
}