/**
 * Created by rusk on 3/8/16.
 */
public class BinarySearchTree {
    public BinaryNode root;
    public BinarySearchTree(){
        root = null;
    }

    public void insert(int data){
        BinaryNode newNode = new BinaryNode();
        newNode.data = data;
        if (root == null){
            root = newNode;
        }else {
            BinaryNode current = root;
            BinaryNode parent;
            while (true){
                parent = current;
                if (data < current.data){
                    current = current.left;
                    if (current == null){
                        parent.left = newNode;
                        break;
                    }
                }else {
                    current = current.right;
                    if (current == null){
                        parent.right = newNode;
                        break;
                    }
                }
            }
        }
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(BinaryNode n){
        if (n != null){
            inOrder(n.left);
            System.out.println(n.getData());
            inOrder(n.right);
        }
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(BinaryNode n){
        if (n != null){
            System.out.println(n.getData());
            preOrder(n.left);
            preOrder(n.right);
        }
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(BinaryNode n){
        if (n != null){
            postOrder(n.left);
            postOrder(n.right);
            System.out.println(n.getData());
        }
    }

    public int min(){
        BinaryNode current = root;
        while (current.left != null){
            current = current.left;
        }
        return current.getData();
    }

    public int max(){
        BinaryNode current = root;
        while (current.right != null){
            current = current.right;
        }
        return current.getData();
    }
}
