/**
 * Created by rusk on 3/8/16.
 */
public class BTree {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(11);
        bst.insert(2);
        bst.insert(5);
        bst.insert(65);
        bst.insert(12);
        System.out.println("InOrder");
        bst.inOrder();
        System.out.println();
        System.out.println("PreOrder");
        bst.preOrder();
        System.out.println();
        System.out.println("PostOrder");
        bst.postOrder();

        System.out.println("The minimum value " + bst.min());
        System.out.println("The maximum value " + bst.max());
    }
}
