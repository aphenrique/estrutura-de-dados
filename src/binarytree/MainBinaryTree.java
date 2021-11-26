package binarytree;

import binarytree.model.Object;

public class MainBinaryTree {
    public static void main(String[] args) {
        
        BinaryTree<Object> tree = new BinaryTree<>();

        tree.addNode(new Object(13));
        tree.addNode(new Object(10));
        tree.addNode(new Object(25));
        tree.addNode(new Object(2));
        tree.addNode(new Object(12));
        tree.addNode(new Object(20));
        tree.addNode(new Object(31));
        tree.addNode(new Object(29));
        tree.addNode(new Object(32));
        
        // TODO: Verificar a não remoção do objeto
        tree.remove(new Object(20));

        tree.traverseInOrder();
        tree.traversePreOrder();
        tree.traversePostOrder();

    }
}
