package queue;

public class Queue<T> {

    private Node<T> refInQueueNode = null;

    public boolean isEmpty() {
        return refInQueueNode == null ? true : false;
    }

    public void enqueue(T object) {
        Node<T> newNode = new Node<T>(object);
        newNode.setRefNode(refInQueueNode);
        refInQueueNode = newNode;
    }

    public T first() {

        if (!this.isEmpty()) {

            Node<T> firstNode = refInQueueNode;

            while (true) {
                if (firstNode.getRefNode() != null) {
                    firstNode = firstNode.getRefNode();
                } else {
                    break;
                }
            }

            return (T) firstNode.getObject();
        }

        return null;
    }

    public T dequeue() {

        if (!this.isEmpty()) {

            Node<T> firstNode = refInQueueNode;
            Node<T> auxNode = refInQueueNode;

            while (true) {
                if (firstNode.getRefNode() != null) {
                    auxNode = firstNode;
                    firstNode = firstNode.getRefNode();
                } else {
                    auxNode.setRefNode(null);
                    break;
                }
            }
            return (T) firstNode.getObject();
        }

        return null;
    }

    @Override
    public String toString() {
        String returnString = "";
        Node<T> auxNod = refInQueueNode;

        if (refInQueueNode != null){
            while(true){
                returnString += "[No{objeto="+ auxNod.getObject() +"}]--->";
                if (auxNod.getRefNode() != null){
                    auxNod = auxNod.getRefNode();
                } else {
                    returnString += "null";
                    break;
                }
            }
        } else {
            returnString = "null";
        }

        return returnString;
    }
}
