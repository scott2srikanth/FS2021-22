package datastructures.tree;

class Tree {
        private class Node{
            private int data;
            private Node leftChild;
            private Node rightChild;

            Node(int data){
                this.data = data;
            }

            public String toString(){
                return "Node = "+data;
            }
        }

        private Node root;

        public void insert(int value){
            Node node = new Node(value);
            if(root == null){
                root = node;
                return;
            }
            Node current = root;
            while (true) {
                if(value < current.data){
                    if(current.leftChild == null){
                        current.leftChild=node;
                        break;
                    }
                    current = current.leftChild;
                }
                else{
                    if(current.rightChild == null){
                        current.rightChild=node;
                        break;
                    }
                    current = current.rightChild;
                }
            }
        }
        public void printTree() {
            print("", root, false);
        }

        public void print(String prefix, Node n, boolean isLeft) {
            if (n != null) {
                System.out.println (prefix + (isLeft ? "├── " : "└── ") + n.data);
                print(prefix + (isLeft ? "│   " : "    "), n.leftChild, true);
                print(prefix + (isLeft ? "│   " : "    "), n.rightChild, false);
            }
        }
    }

    public class BST{
        public static void main(String[] args) {
            Tree t = new Tree();
            t.insert(7);
            t.insert(4);
            t.insert(15);
            t.insert(1);
            t.insert(5);
            t.insert(3);
            t.insert(12);
            t.insert(6);
            t.printTree();
        }

}
