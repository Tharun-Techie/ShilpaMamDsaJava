package Day7;

class Node {
    int data;
    Node left, right;

    Node(int ele) {
        data = ele;
        left = null;
        right = null;
    }
}

class BinTree {
    Node root;

    BinTree() {
        root = null;
    }

    Node insert(Node root, int ele) {
        if (root == null) {
            return new Node(ele);
        }
        if (ele < root.data) {
            root.left = insert(root.left, ele);
        } else {
            root.right = insert(root.right, ele);
        }
        return root;
    }

    void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    void preOrder(Node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    int findMax(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    Node delete(Node root, int ele) {
        if (root == null)
            return root;
        if (ele < root.data)
            root.left = delete(root.left, ele);
        else if (ele > root.data)
            root.right = delete(root.right, ele);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                root.data = findMax(root.left);
                root.left = delete(root.left, root.data);
            }
        }
        return root;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        BinTree b = new BinTree();
        int[] data = {48, 30, 20, 10, 25, 5, 15, 60, 78, 53, 89, 80, 90};

        for (int i = 0; i < data.length; i++)
            b.root = b.insert(b.root, data[i]);

        System.out.println("Inorder traversal after insertion:");
        b.inorder(b.root);

        System.out.println("Deleting 5");
        b.root = b.delete(b.root, 5);
        System.out.println("Inorder traversal after deleting 5:");
        b.inorder(b.root);

        System.out.println("Deleting 15");
        b.root = b.delete(b.root, 15);
        System.out.println("Inorder traversal after deleting 15:");
        b.inorder(b.root);

        System.out.println("Deleting 30");
        b.root = b.delete(b.root, 30);
        System.out.println("Inorder traversal after deleting 30:");
        b.inorder(b.root);

        System.out.println("Deleting 60");
        b.root = b.delete(b.root, 60);
        System.out.println("Inorder traversal after deleting 60:");
        b.inorder(b.root);
    }
}

