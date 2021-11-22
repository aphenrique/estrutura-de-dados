package queue;

public class QueueNode<T> {

    private T object;
    private QueueNode<T> refNode = null;

    QueueNode(){}

    QueueNode(T object){
        this.object = object;
    }
    
    public T getObject(){
        return this.object;
    }
    
    public void setObject(T object) {
        this.object = object;
    }
    
    public QueueNode<T> getRefNode() {
        return refNode;
    }
    
    public void setRefNode(QueueNode<T> refNode) {
        this.refNode = refNode;
    }
    
    @Override
    public String toString() {
        return "No{ dado=" + this.object + "}";
    }
}
