package stack;

public class Node {
    private int value;
    private Node previousNode = null;

    public Node(){};

    public Node(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getPreviousNode() {
        return previousNode;
    }
    public void setPreviousNode(Node node) {
        this.previousNode = node;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value: " + value +
                "}";
    }
}
