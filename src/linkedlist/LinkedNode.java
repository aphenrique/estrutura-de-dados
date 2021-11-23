package linkedlist;

public class LinkedNode<T> {
    private T object;
    private LinkedNode<T> nextNode = null;

    public LinkedNode() {}

    public LinkedNode(T object) {
        this.object = object;
    }

    public LinkedNode(T object, LinkedNode nextNode){
        this.object = object;
        this.nextNode = nextNode;
    }

    public T getObject() {
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public LinkedNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{ value=" + this.object + "}";
    }
}
