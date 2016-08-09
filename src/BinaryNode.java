/**
 * Created by rusk on 3/8/16.
 */
public class BinaryNode {
    public int data;
    public BinaryNode left;
    public BinaryNode right;

    public BinaryNode(int data){
        this.data = data;
        left = null;
        right = null;
    }

    public BinaryNode(){
        left = null;
        right = null;
    }
    int getData(){
        return data;
    }
}
