package stack;

public class StackNode {
    private int value;
    private StackNode previousNode = null;

    public StackNode(){};

    public StackNode(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public StackNode getPreviousNode() {
        return previousNode;
    }
    public void setPreviousNode(StackNode node) {
        this.previousNode = node;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value: " + value +
                "}";
    }
}
