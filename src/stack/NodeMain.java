package stack;

public class NodeMain {

    public static void main(String[] args) {
        Stack myStack = new Stack();

        for (int i = 1; i <= 10; i++) {
            myStack.push(new StackNode(i));
        }

        System.out.println(myStack.toString());

        System.out.println(myStack.pop());

        System.out.println(myStack.toString());

        myStack.push(new StackNode(99));
    }

}
