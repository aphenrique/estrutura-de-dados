package binarytree;

public class BinaryTree<T extends Comparable<T>> {

    private TreeNode<T> source;

    public BinaryTree() {
        this.source = null;
    }

    public void addNode(T object) {
        TreeNode<T> newNode = new TreeNode<>(object);
        source = addNode(source, newNode);
    }

    private TreeNode<T> addNode(TreeNode<T> current, TreeNode<T> newNode) {
        // Se current for null, é o nó raiz
        if (current == null) {
            return newNode;
            /// Não sendo o nó raiz, verifica se o valor é menor que o nó corrente/atual
            /// O método compareTo retorna -1 se for menor, 0 para igual e 1 para maior.
        } else if (newNode.getObject().compareTo(current.getObject()) < 0) {
            current.setLeftNode(addNode(current.getLeftNode(), newNode));
        } else {
            current.setRightNode(addNode(current.getRightNode(), newNode));
        }

        return current;
    }

    public void traverseInOrder() {
        System.out.println("\nExibição em ordem:");
        traverseInOrder(this.source);
    }

    private void traverseInOrder(TreeNode<T> currentNode) {
        if (currentNode != null) {
            traverseInOrder(currentNode.getLeftNode());
            System.out.print(currentNode.getObject() + ", ");
            traverseInOrder(currentNode.getRightNode());
        }
    }

    public void traversePostOrder() {
        System.out.println("\nExibição pós ordem:");
        traversePostOrder(this.source);
    }

    private void traversePostOrder(TreeNode<T> currentNode) {
        if (currentNode != null) {
            traversePostOrder(currentNode.getLeftNode());
            traversePostOrder(currentNode.getRightNode());
            System.out.print(currentNode.getObject() + ", ");
        }
    }

    public void traversePreOrder() {
        System.out.println("\nExibição pré ordem:");
        traversePreOrder(this.source);
    }

    private void traversePreOrder(TreeNode<T> currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.getObject() + ", ");
            traversePreOrder(currentNode.getLeftNode());
            traversePreOrder(currentNode.getRightNode());
        }
    }

    public void remove(T object) {
        try {
            TreeNode<T> currentNode = this.source;
            TreeNode<T> parentNode = null;
            TreeNode<T> childNode = null;
            TreeNode<T> temporaryNode = null;

            while (currentNode != null && !currentNode.getObject().equals(object)) {

                parentNode = currentNode;
                if (object.compareTo(currentNode.getObject()) < 0) {
                    currentNode = currentNode.getLeftNode();
                } else {
                    currentNode = currentNode.getRightNode();
                }
            }

            if (currentNode == null) {
                System.err.println("Conteúdo não encontrado! | Bloco try");
            }

            if (parentNode == null) {
                if (currentNode.getRightNode() == null) {
                    this.source = currentNode.getLeftNode();
                } else if (currentNode.getLeftNode() == null) {
                    this.source = currentNode.getRightNode();
                } else {
                    for (temporaryNode = currentNode, childNode = currentNode.getLeftNode(); childNode
                            .getRightNode() != null; temporaryNode = childNode, childNode = childNode.getLeftNode()) {

                        if (childNode != currentNode.getLeftNode()) {
                            temporaryNode.setRightNode(childNode.getLeftNode());
                            childNode.setLeftNode(source.getLeftNode());
                        }
                    }

                    childNode.setRightNode(source.getRightNode());
                    source = childNode;
                }

            } else if (currentNode.getRightNode() == null) {

                if (parentNode.getLeftNode() == currentNode) {
                    parentNode.setLeftNode(currentNode.getLeftNode());
                } else {
                    parentNode.setRightNode(currentNode.getLeftNode());
                }

            } else if (currentNode.getLeftNode() == null) {

                if (parentNode.getLeftNode() == currentNode) {
                    parentNode.setLeftNode(currentNode.getRightNode());
                } else {
                    parentNode.setRightNode(currentNode.getRightNode());
                }

            } else {

                for (temporaryNode = currentNode, childNode = currentNode.getLeftNode(); childNode.getRightNode() != null; temporaryNode = childNode, childNode = childNode
                        .getRightNode()) {
                    if (childNode != currentNode.getLeftNode()) {
                        temporaryNode.setRightNode(childNode.getLeftNode());
                        childNode.setLeftNode(currentNode.getLeftNode());
                    }
                    childNode.setRightNode(currentNode.getRightNode());
                    if (parentNode.getLeftNode() == currentNode) {
                        parentNode.setLeftNode(childNode);
                    } else {
                        parentNode.setRightNode(childNode);
                    }
                }

            }

        } catch (NullPointerException error) {
            System.err.println("Conteúdo não encontrado");
        }
    }
}
