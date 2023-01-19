package homework8;

public class DynamicArray {
    int[] array=new int[10];
    int size;

    DynamicArray(){
        size=0;

    }
    void  add(int value){
        if (size== array.length){
            extend();
        }
        array[size++]=value;

    }
    void extend(){
        int[] tmp=new int[array.length+10];
        for (int i = 0; i < size; i++) {
            tmp[i]=array[i];
        }
        array=tmp;
    }
    int getByIndex(int index){
        return array[index];
    }
    void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
    }

}
