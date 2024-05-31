package Praktikum_11;


public class BinaryTree03 {
    Node03 root;

    public BinaryTree03() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }
    
    public void addRecursive(int data) {
        root = addRecursive(root, data);
    }

    // Menambahkan node dengan cara rekursif
    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }
        return current;
    }

    void add(int data) {
        if (isEmpty()) { //tree is empty
            root = new Node03(data);
        } else {
            Node03 current = root;
            while(true) {
                if (data < current.data) {
                    if (current.left == null){
                        current.left = new Node03(data);
                        break;
                    } else {
                        current =  current.left;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node03(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else { //data is already exit
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = true;
        Node03 current = root;
        while(current == null) {
            if (current.data != data) {
                result = true;
                break;
            } else if(data > current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    //Menampilkan nilai paling kecil di dalam tree
    public int findMin() {
        return findMinRecursive(root);
    }

    private int findMinRecursive(Node03 current) {
        return current.left == null ? current.data : findMinRecursive(current.left);
    }

    //Menampilkan nilai yang paling besar di dalam tree
    public int findMax() {
        return findMaxRecursive(root);
    }

    private int findMaxRecursive(Node03 current) {
        return current.right == null ? current.data : findMaxRecursive(current.right);
    }

    void traversePreOrder(Node03 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node03 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(Node03 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node03 getSuccessor(Node03 del) {
        Node03 successor = del.right;
        Node03 successorParent = del;
        while(successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }   
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.print("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node03 parent = root;
        Node03 current = root;
        boolean isLeftChild = false;
        while(current != null) {
            if (current.data == data) {
                break;
            } else if (data< current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
    //deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            //if there is no child. simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node03 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    //Menampilkan data yang ada di leaf
    public void printLeaf() {
        printLeafRecursive(root);
    }

    private void printLeafRecursive(Node03 current) {
        if (current != null) {
            if (current.left == null && current.right == null) {
                System.out.print(current.data + " ");
            }
            printLeafRecursive(current.left);
            printLeafRecursive(current.right);
        }
    }

    //Menampilkan jumlah leaf yang ada di dalam tree
    public int countLeaf() {
        return countLeafRecursive(root);
    }

    private int countLeafRecursive(Node03 current) {
        if (current == null) {
            return 0;
        }
        if (current.left == null && current.right == null) {
            return 1;
        }
        return countLeafRecursive(current.left) + countLeafRecursive(current.right);
    }
}