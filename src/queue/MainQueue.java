package queue;

public class MainQueue {

    public static void main(String[] args) {
        Queue myQueue = new Queue();

        myQueue.enqueue(new Node("Primeiro"));
        myQueue.enqueue(new Node("Segundo"));
        myQueue.enqueue(new Node("Terceiro"));
        myQueue.enqueue(new Node("Quarto"));

        System.out.println(myQueue);
        
        System.out.println(myQueue.dequeue());
        
        System.out.println(myQueue);
        
        System.out.println(myQueue.first());
    }
    
}
