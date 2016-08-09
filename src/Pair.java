/**
 * Created by rusk on 24/7/16.
 */
public class Pair<T, V> {
    private T firstItem;
    private V secondItem;
    public Pair(T first, V second) {
        firstItem = first;
        secondItem = second;
    }

    public T getFirstItem(){
        return firstItem;
    }

    public V getSecondItem(){
        return secondItem;
    }
}
