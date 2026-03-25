package LinkedList;

class Nodee{
    Nodee prev;
    Nodee next;
    int data;
}
public class DoublyLL {
    Nodee head;
    Nodee tail;

    void insertFirst(int val){
            Nodee n = new Nodee();
            n.data= val;
            n.next = head;
            n.prev = null;
            if(head != null){
                head.prev = n;
            }
            head = n;
            if(tail == null){
                tail = n;
            }
    }
    void insertLast(int val){
        Nodee n = new Nodee();
        n.data= val;
        n.next = null;
        if(tail == null) {
            n.prev = null;
            head = n;
            tail = n;
        }
        n.prev = tail;
        tail.next = n;
        tail = n;
    }

    public static void main(String[] args) {

    }
}
