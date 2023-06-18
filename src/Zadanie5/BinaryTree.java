package Zadanie5;

public class BinaryTree {
    private final int value;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public void insert(int value) {
        if (value < this.value) {
            if (left == null) {
                left = new BinaryTree(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new BinaryTree(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean search(int value) {
        if (value == this.value) {
            return true;
        } else if (value < this.value) {
            if (left == null) {
                return false;
            } else {
                return left.search(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.search(value);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        boolean searchResult = bst.search(40);
        System.out.println("Search for value 40: " + searchResult);
    }
}