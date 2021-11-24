package doublelinkedlist;

public class MainDoubleLinkedList {
    public static void main(String[] args) {
        
        DoubleLinkedList<String> doubleLinkedList = new DoubleLinkedList<>();

        doubleLinkedList.add("Primeiro");
        doubleLinkedList.add("Segundo");
        doubleLinkedList.add("Terceiro");
        doubleLinkedList.add("Quarto");

        System.out.println(doubleLinkedList.toString());
        
        doubleLinkedList.remove(2);
        
        System.out.println(doubleLinkedList.toString());
    }
}
