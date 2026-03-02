package ArrayList;

public class ArrayList1 {
    int capacity;
    int size;
    int[] arr;

    ArrayList1(){
        capacity = 10;      // initializing default values
        size= 0;
        arr = new int[capacity];
    }
    // add element at last
    void addVal(int val){
        if(size == capacity) resize();
        arr[size++] = val;
    }
    //add element with index
    void addVal(int index, int val){
        if (index < size) {
            arr[index] = val;
        }
    }
    // get element
    int getVal(int index){
        if(index>= size){
            System.out.println("invalid index");
            return 0;
        }else
            return arr[index];
    }
    void remove(int index){
        if(index<size){
            for (int i = index; i < size; i++) {
                arr[i] = arr[i+1];
            }
            size--;
        }
    }

    void resize(){
        capacity = capacity + (capacity/2);
        int[] newArr = new int[capacity];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public static void main(String[] args) {
        ArrayList1 al = new ArrayList1();
        al.addVal(20);
        al.addVal(50);
        al.addVal(40);
        al.addVal(63);
        al.addVal(25);
        al.addVal(45);
        al.addVal(80);
        al.addVal(79);
        al.addVal(54);
        al.addVal(36);
        al.addVal(11);
        al.remove(3);

        for (int i = 0; i < al.size; i++) {
            System.out.print(al.getVal(i)+" ");
        }
    }
}
