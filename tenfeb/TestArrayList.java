 class MyArrayList<E> {

    private Object[] data;   
    private int size;        

    
    public MyArrayList() {
        data = new Object[10];   
        size = 0;
    }

    
    public void add(E element) {

       
        if (size == data.length) {
            resize();
        }

       
        data[size] = element;
        size++;
    }

    
    private void resize() {
        int newCapacity = data.length * 2;
        Object[] newData = new Object[newCapacity];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
public class TestArrayList {
    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.display();
    }
}
