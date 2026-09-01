/*Approach: [BFS] Create a binary tree and create 2 functions to find the min and max nodes of the tree*/

public class MinMax {
    static class Node {
        int data;
        Node left;
        Node right;
        // Constructor
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        Node root;

        // Constructor
        BinaryTree() {
            root = null;
        }

        int findMin(Node root) {
            // If tree is empty
            if (root == null) {
                return Integer.MAX_VALUE;
            }

            // Find minimum in left & right subtree
            int leftMin = findMin(root.left);
            int rightMin = findMin(root.right);

            return Math.min(root.data, Math.min(leftMin, rightMin)); // Compare current node, left minimum and right minimum
        }

        int findMax(Node root) {
            if (root == null) {
                return Integer.MIN_VALUE;
            }

            int leftMax = findMax(root.left);
            int rightMax = findMax(root.right);

            return Math.max(root.data, Math.max(leftMax, rightMax));
        }
    }

    public static void main(String[] args) {
        // Create a BinaryTree object
        BinaryTree tree = new BinaryTree();
        /*
                  10
                 /  \
                5    20
               / \   / \
              3   8 15  25
        */
        tree.root = new Node(10);

        tree.root.left = new Node(5);
        tree.root.right = new Node(20);

        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(8);

        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(25);

        int minimum = tree.findMin(tree.root);
        int maximum = tree.findMax(tree.root);

        System.out.println("Minimum node = " + minimum);
        System.out.println("Maximum node = " + maximum);
    }
}