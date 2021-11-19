package queue;

public class Node<T> {

    private T object;
    private Node<T> refNode = null;

    Node(){}

    Node(T object){
        this.object = object;
    }
    
    public T getObject(){
        return this.object;
    }
    
    public void setObject(T object) {
        this.object = object;
    }
    
    public Node<T> getRefNode() {
        return refNode;
    }
    
    public void setRefNode(Node<T> refNode) {
        this.refNode = refNode;
    }
    
    @Override
    public String toString() {
        return "No{ dado=" + this.object + "}";
    }
}
