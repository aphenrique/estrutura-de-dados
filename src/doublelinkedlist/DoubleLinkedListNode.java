package doublelinkedlist;

public class DoubleLinkedListNode<T> {
    private T object;
    private DoubleLinkedListNode<T> nextNode = null;
    private DoubleLinkedListNode<T> previousNode = null;

    public DoubleLinkedListNode() {}

    public DoubleLinkedListNode(T object) {
        this.object = object;
    }

    public T getObject() {
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public DoubleLinkedListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleLinkedListNode<T> node) {
        this.nextNode = node;
    }

    public DoubleLinkedListNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoubleLinkedListNode<T> node) {
        this.previousNode = node;
    }

    @Override
    public String toString() {
        return "Node{ value=" + this.object + "}";
    }
}
