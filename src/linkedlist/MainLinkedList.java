package linkedlist;

public class MainLinkedList {

    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("teste1");
        linkedList.add("teste2");
        linkedList.add("teste3");
        linkedList.add("teste4");

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));

        System.out.println(linkedList);

        linkedList.remove(3);

        System.out.println(linkedList);
    }
    
}
