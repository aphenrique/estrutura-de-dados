package binarytree;

public class BinaryTree<T extends Comparable<T>> {

    private TreeNode source;

    public BinaryTree() {
        this.source = null;
    }

    public void addNode(T object) {
        TreeNode<T> newNode = new TreeNode<>(object);
        source = addNode(source, newNode);
    }

    private TreeNode<T> addNode(TreeNode<T> current, TreeNode<T> newNode) {
        if (current == null){
            return newNode;
        }else if (newNode.getObject().compareTo(current.getObject()) < 0){ // O método compareTo retorna -1 se for menor, 0 para igual e 1 para maior.
            current.setLeftNode(addNode(current.getLeftNode(), newNode));
        } else {
            current.setRightNode(addNode(current.getRightNode(), newNode));
        }

        return current;
    }
}
