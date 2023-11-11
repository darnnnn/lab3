@SuppressWarnings("unchecked")
public class MyArray<T> {

    private T[] array;

    public MyArray() {
        array = (T[]) new Object[10];
    }

    public MyArray(int size) {
        array = (T[]) new Object[size];
    }
    
    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public void add(T value) {
    	array[index] = value;
    }
}    