package queue;

public class Node {

    private Object object;
    private Node refNode = null;

    Node(){}

    Node(Object object){
        this.object = object;
    }
    
    public Object getObject(){
        return this.object;
    }
    
    public void setObject(Object object) {
        this.object = object;
    }
    
    public Node getRefNode() {
        return refNode;
    }
    
    public void setRefNode(Node refNode) {
        this.refNode = refNode;
    }
    
    @Override
    public String toString() {
        return "No{ dado=" + this.object + "}";
    }
}
