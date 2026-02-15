public abstract class BaseEntity {
    private static int counter = 1;
    private final int id;
    private final String name;

    public BaseEntity(String name) {
        this.name = name;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}