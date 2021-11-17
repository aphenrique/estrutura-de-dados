package node;

public class MyNode<T> {

    private T value;
    private MyNode<T> nextNode;

    MyNode(T value) {
        this.nextNode = null;
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public MyNode getNextNode() {
        return this.nextNode;
    }

    public void setNext(MyNode node) {
        this.nextNode = node;
    }

    @Override
    public String toString() {
        return "Node {valor: " + this.value + " }";
    }
}
