package stack;

public class Stack {
    
    private Node refStackTopNode;

    public Stack(){
        this.refStackTopNode = null;
    }

    public Node top(){
        return refStackTopNode;
    }

    public void push(Node newNode){
        Node refAuxNode = refStackTopNode;
        refStackTopNode = newNode;
        refStackTopNode.setPreviousNode(refAuxNode);
    }

    public Node pop(){
        if (!isEmpty()){
            Node nodePoped = refStackTopNode;
            refStackTopNode = refStackTopNode.getPreviousNode();
            return nodePoped;
        }
        return null;
    }

    public boolean isEmpty(){
        return refStackTopNode == null ? true : false;
    }

    @Override
    public String toString() {
        String output = "=============== STACK ===============\n";

        Node auxNode = refStackTopNode;

        while(true){
            if ( auxNode != null ){
                output += "Node{value: " + auxNode.getValue() + "}\n";
                auxNode = auxNode.getPreviousNode();
            } else {
                break;
            }
        }

        output += "============= END STACK =============\n";

        return output;
    }
}
