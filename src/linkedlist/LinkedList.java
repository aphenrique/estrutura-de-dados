package linkedlist;

public class LinkedList<T> {

    private LinkedNode<T> refEnterNode;

    public LinkedList() {
        this.refEnterNode = null;
    }

    public boolean isEmpty() {
        return refEnterNode == null ? true : false;
    }

    public int size() {
        int listSize = 0;
        LinkedNode<T> auxNode = refEnterNode;

        while (true) {
            if (auxNode != null) {
                listSize++;
                if (auxNode.getNextNode() != null) {
                    auxNode = auxNode.getNextNode();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return listSize;
    }

    public void add(T object) {
        LinkedNode<T> linkedNode = new LinkedNode<>(object);
        if (isEmpty()) {
            refEnterNode = linkedNode;
            return;
        }

        LinkedNode<T> auxLinkedNode = refEnterNode;

        // TODO: testar este laço. Pode haver um erro na inclusão do segundo valor, no
        // índice 1
        for (int i = 0; i < this.size() - 1; i++) {
            auxLinkedNode = auxLinkedNode.getNextNode();
        }

        auxLinkedNode.setNextNode(linkedNode);

    }

    public T get(int index) {
        return getLinkedNode(index).getObject();
    }

    public T remove(int index) {
        LinkedNode<T> auxLinkedNode = this.getLinkedNode(index);

        if (index == 0) {
            refEnterNode = auxLinkedNode.getNextNode();
            return auxLinkedNode.getObject();
        }

        LinkedNode<T> previousNode = getLinkedNode(index - 1);
        previousNode.setNextNode(auxLinkedNode.getNextNode());

        return auxLinkedNode.getObject();
    }

    private LinkedNode<T> getLinkedNode(int index) {
        indexValidate(index);
        LinkedNode<T> auxLinkedNode = refEnterNode;
        LinkedNode<T> returnLinkedNode = null;
        for (int i = 0; i <= index; i++) {
            returnLinkedNode = auxLinkedNode;
            auxLinkedNode = auxLinkedNode.getNextNode();
        }
        return returnLinkedNode;
    }

    private void indexValidate(int index) {
        if (index >= this.size()) {
            int lastIndex = this.size();
            throw new IndexOutOfBoundsException("Index not in the range between 0 and " + lastIndex);
        }
    }

    public LinkedNode<T> getRefEnterNode() {
        return refEnterNode;
    }

    public void setReferenciaEntrada(LinkedNode<T> refEnterNode) {
        this.refEnterNode = refEnterNode;
    }

    @Override
    public String toString() {
        String returnString = "";
        LinkedNode<T> auxLinkedNode = refEnterNode;
        for(int i = 0; i < size(); i++){
            returnString += "[No{conteudo=" + auxLinkedNode.getObject() +"}]--->";
            auxLinkedNode = auxLinkedNode.getNextNode();
        }
        returnString += "null";
        return returnString;
    }
}
