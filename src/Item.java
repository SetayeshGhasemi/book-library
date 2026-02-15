public abstract class Item extends BaseEntity {

    protected boolean borrowed;
    protected Member borrowedBy;

    public Item(String title) {
        super(title);
    }

    public String getTitle()
    {
        return getName();
    }

    public abstract boolean updateStatus();
}