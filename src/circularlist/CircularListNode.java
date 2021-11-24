package circularlist;

public class CircularListNode<T> {
    private T object;
    private CircularListNode<T> nextNode;

    public CircularListNode(T object){
        this.object = object;
        this.nextNode = null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public CircularListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(CircularListNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{ value=" + this.object + "}";
    }
}
