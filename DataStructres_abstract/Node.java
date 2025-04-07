package DataStructres_abstract;

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        return rightLink = item;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return leftLink=item;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            // Compare as strings if the values are non-null
            return ((String) this.getValue()).compareTo((String) item.getValue());
        } else {
            // Return 1 if the other item is null (this item is greater)
            return 1;
        }
    }
}
