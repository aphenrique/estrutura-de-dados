package node;

public class MainNode {

    public static void main(String[] args) {
        MyNode<String> node1 = new MyNode<String>("Primeiro");

        MyNode<String> node2 = new MyNode<>("Segundo");

        node1.setNext(node2);

        MyNode<String> node3 = new MyNode<>("Terceiro");

        node2.setNext(node3);

        System.out.println(node1);
        System.out.println(node1.getNextNode());
        System.out.println(node1.getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode());

    }

}
