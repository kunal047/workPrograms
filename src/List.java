/**
 * Created by rusk on 24/7/16.
 */
public class List<T> {


    private T[] dataStore;
    private  int size;
    private  int pos;

    public List(int numElements){
        size = numElements;
        pos = 0;
        dataStore = (T[]) new Object[size];
    }

    public  void add(T element){
        dataStore[pos] = element;
        pos++;
    }

    public  String toString() throws ListEmptyException {
        if (dataStore[0] == null){
            throw new ListEmptyException();
        }
        String elements = "";
        for (int i = 0; i < pos; i++) {
            elements += dataStore[i] + " ";
        }
        return elements;
    }
}
