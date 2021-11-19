package stack;

public class Stack {
    
    private StackNode refStackTopNode;

    public Stack(){
        this.refStackTopNode = null;
    }

    public StackNode top(){
        return refStackTopNode;
    }

    public void push(StackNode newNode){
        StackNode refAuxNode = refStackTopNode;
        refStackTopNode = newNode;
        refStackTopNode.setPreviousNode(refAuxNode);
    }

    public StackNode pop(){
        if (!isEmpty()){
            StackNode nodePoped = refStackTopNode;
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

        StackNode auxNode = refStackTopNode;

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
