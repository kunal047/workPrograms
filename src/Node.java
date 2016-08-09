/**
 * Created by rusk on 24/7/16.
 */
public class Node<T> {
    private T data;
    public Node next;

    public Node(T data){
        this.data = data;
        next = null;
    }

    T getData(){
        return data;
    }
}
