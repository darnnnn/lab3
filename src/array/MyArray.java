package array;

@SuppressWarnings("unchecked")
public class MyArray<T> {

    private T[] array;

    public MyArray() {
        array = (T[]) new Object[10];
    }

    public MyArray(int size) {
        array = (T[]) new Object[size];
    }

    public T get(int index) {
        return array[index];
    }

    public void add(T value) {
        if (checkFull() == array.length) increase();
        array[checkFull()] = value;
    }

    public int size(){
        return checkFull();
    }

    private int checkFull(){
      int index = 0;
      for (int i=0; i<array.length; i++){
        if (array[i] != null) index++;
      }  
      return index;
    }

    private void increase(){
      T[] newArray = Arrays.copyOf(array, array.length*2);
      array = newArray;
    }

}     