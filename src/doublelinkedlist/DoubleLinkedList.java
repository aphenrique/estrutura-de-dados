package doublelinkedlist;

public class DoubleLinkedList<T> {

    private DoubleLinkedListNode<T> refFirstNode;
    private DoubleLinkedListNode<T> refLastNode;
    private int listSize;

    public DoubleLinkedList() {
        refFirstNode = null;
        refLastNode = null;
        listSize = 0;
    }

    public DoubleLinkedListNode<T> getRefFirstNode() {
        return refFirstNode;
    }

    public void setRefFirstNode(DoubleLinkedListNode<T> refFirstNode) {
        this.refFirstNode = refFirstNode;
    }

    public DoubleLinkedListNode<T> getRefLastNode() {
        return refLastNode;
    }

    public void setRefLastNode(DoubleLinkedListNode<T> refLastNode) {
        this.refLastNode = refLastNode;
    }

    public void add(T object) {
        DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<>(object);
        newNode.setNextNode(null);
        newNode.setPreviousNode(this.refLastNode);

        if (refFirstNode == null) {
            refFirstNode = newNode;
        }

        if (refLastNode != null) {
            refLastNode.setNextNode(newNode);
        }

        refLastNode = newNode;

        listSize++;
    }

    public void add(int index, T object) {
        DoubleLinkedListNode<T> auxDoubleLinkedListNode = getDoubleLinkedListNode(index);
        DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<>(object);

        newNode.setNextNode(auxDoubleLinkedListNode);

        if (newNode.getNextNode() != null) {
            newNode.setPreviousNode(auxDoubleLinkedListNode.getPreviousNode());
            newNode.getNextNode().setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(refLastNode);
            refLastNode = newNode;
        }

        if (index == 0) {
            refFirstNode = newNode;
        } else {
            newNode.getPreviousNode().setNextNode(newNode);
        }

        listSize++;
    }

    public void remove(int index) {

        if (index == 0) {
            refFirstNode = refFirstNode.getNextNode();

            if (refFirstNode != null) {
                refFirstNode.setPreviousNode(null);
            }

        } else {
            DoubleLinkedListNode<T> auxDoubleLinkedListNode = getDoubleLinkedListNode(index);
            auxDoubleLinkedListNode.getPreviousNode().setNextNode(auxDoubleLinkedListNode.getNextNode());

            if (auxDoubleLinkedListNode.getNextNode() != refLastNode) {
                auxDoubleLinkedListNode.getNextNode().setPreviousNode(auxDoubleLinkedListNode.getPreviousNode());
            } else {
                refLastNode = auxDoubleLinkedListNode;
            }
        }

        listSize--;
    }

    public int size() {
        return listSize;
    }

    public T get(int index) {
        return getDoubleLinkedListNode(index).getObject();
    }

    private DoubleLinkedListNode<T> getDoubleLinkedListNode(int index) {
        DoubleLinkedListNode<T> auxDoubleLinkedListNode = refFirstNode;

        for (int i = 0; (i < index) && (auxDoubleLinkedListNode != null); i++) {
            auxDoubleLinkedListNode = auxDoubleLinkedListNode.getNextNode();
        }
        return auxDoubleLinkedListNode;
    }

    @Override
    public String toString() {
        String returnString = "";
        DoubleLinkedListNode<T> auxDoubleLinkedListNode = refFirstNode;

        for (int i = 0; i < size(); i++) {
            returnString += "[No{value=" + auxDoubleLinkedListNode.getObject() +"}]--->";
            auxDoubleLinkedListNode = auxDoubleLinkedListNode.getNextNode();
        }
        return returnString;
    }
}
