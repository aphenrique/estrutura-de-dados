package circularlist;

public class CircularList<T> {

    private CircularListNode<T> head;
    private CircularListNode<T> teal;
    private int listSize;

    public CircularList() {
        this.head = null;
        this.teal = null;
        this.listSize = 0;
    }

    public void add(T object) {
        CircularListNode<T> newCircularListNode = new CircularListNode<>(object);

        if (this.isEmpty()) {
            this.head = newCircularListNode;
            this.teal = this.head;
            this.head.setNextNode(teal);
        } else {
            newCircularListNode.setNextNode(this.teal);
            this.head.setNextNode(newCircularListNode);
            this.teal = newCircularListNode;
        }

        this.listSize++;
    }

    public void remove(int index) {
        if (index >= this.listSize)
            throw new IndexOutOfBoundsException("Index is longer than list");

        CircularListNode<T> auxCircularListNode = this.teal;

        if (index == 0) {
            this.teal = this.teal.getNextNode();
            this.head.setNextNode(this.teal);
        } else if (index == 1) {
            this.teal.setNextNode(this.teal.getNextNode());
        } else {
            for (int i = 0; i < index - 1; i++) {
                auxCircularListNode = auxCircularListNode.getNextNode();
            }

            auxCircularListNode.setNextNode(auxCircularListNode.getNextNode().getNextNode());
        }

        this.listSize--;

    }

    public T get(int index) {
        return getCircularListNode(index).getObject();
    }

    private CircularListNode<T> getCircularListNode(int index) {

        if (this.isEmpty())
            throw new IndexOutOfBoundsException("List is empty!");

        if (index == 0)
            return this.teal;

        CircularListNode<T> auxCircularListNode = teal;

        for (int i = 0; i < index; i++)
            auxCircularListNode = auxCircularListNode.getNextNode();

        return auxCircularListNode;
    }

    public boolean isEmpty() {
        return this.listSize == 0 ? true : false;
    }

    public int size() {
        return listSize;
    }

    @Override
    public String toString() {
        String returnString = "";
        CircularListNode<T> auxCircularListNode = this.teal;

        for (int i = 0; i < size(); i++) {
            returnString += "[No{value=" + auxCircularListNode.getObject() + "}]--->";
            auxCircularListNode = auxCircularListNode.getNextNode();
        }
        returnString += "return to begin";
        return returnString;
    }
}
