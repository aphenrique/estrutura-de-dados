package binarytree;

public class TreeNode<T extends Comparable<T>> {
    private T object;
    private TreeNode<T> leftNode;
    private TreeNode<T> rightNode;

    public TreeNode(T object) {
        this.object = object;
        this.leftNode = null;
        this.rightNode = null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public TreeNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "Node{value: " + this.object + "}";
    }
}
