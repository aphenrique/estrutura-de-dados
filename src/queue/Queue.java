package queue;

public class Queue {

    private Node refInQueueNode = null;

    public boolean isEmpty() {
        return refInQueueNode == null ? true : false;
    }

    public void enqueue(Node newNode) {
        newNode.setRefNode(refInQueueNode);
        refInQueueNode = newNode;
    }

    public Node first() {

        if (!this.isEmpty()) {

            Node firstNode = refInQueueNode;

            while (true) {
                if (firstNode.getRefNode() != null) {
                    firstNode = firstNode.getRefNode();
                } else {
                    break;
                }
            }

            return firstNode;
        }

        return null;
    }

    public Node dequeue() {

        if (!this.isEmpty()) {

            Node firstNode = refInQueueNode;
            Node auxNode = refInQueueNode;

            while (true) {
                if (firstNode.getRefNode() != null) {
                    auxNode = firstNode;
                    firstNode = firstNode.getRefNode();
                } else {
                    auxNode.setRefNode(null);
                    break;
                }
            }
            return firstNode;
        }

        return null;
    }

    @Override
    public String toString() {
        String returnString = "";
        Node auxNod = refInQueueNode;

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
