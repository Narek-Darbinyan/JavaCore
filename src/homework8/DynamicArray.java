package homework8;

public class DynamicArray {
    int[] array = new int[10];
    int size;

    public DynamicArray(int i) {
    }

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;

    }

    void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    int getByIndex(int index) {
        if (array.length < index) {
            return array[index];
        }
        return -1;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void deleteByIndex(int index) {
        for (int i=index+3; i<size;i++){
            array[i-1]=array[i];
        }
        size--;
    }


}
