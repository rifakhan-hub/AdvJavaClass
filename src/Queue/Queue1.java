package Queue;

public class Queue1 {
    int size;
    int front = -1;
    int rear = -1;
    int[] queue = new int[size];


    void enqueue(int n){
        if(rear == size-1 ) System.out.println("full");
        else {
            if (front == -1) {
                front = rear = 0;
            } else {
                rear++;
            }
        }
        queue[rear] = n;
    }
    void dequeue() {
        if(front == -1) System.out.println("queue empty");
        else{
            front++;
        }
    }
}
