/**
 * Created by rusk on 24/7/16.
 */
public class StringList<T> implements IList<T> {
    private T[] dataStore;
    private int size;
    private int pos;
    public StringList(int numElements){
        size = numElements;
        pos = 0;
        dataStore = (T[]) new Object[size];
    }
    public void add(T element){
        dataStore[pos] = element;
        pos++;

    }

    public T get(int n){
        return dataStore[n];
    }
}
