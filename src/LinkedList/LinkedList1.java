package LinkedList;

class Nodes {
    int data;
    Nodes next;
}

public class LinkedList1 {
    Nodes Head;

    // new_Node : [30 | null]
    // Head : [ 20 | [ 10 | null] ]

    void insertFirst(int value) {
        // write code here

        Nodes n = new Nodes();
        n.data = value;
        n.next = Head;
        Head = n;
    }

    void insertLast(int value) {

        if (Head == null) Head.data = value;
        else {
            Nodes temp = Head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Nodes n = new Nodes();
            n.data = value;
            temp.next = n;
        }
    }

    void delFirst() {
        if (Head == null) System.out.println("empty");
        else Head = Head.next;
    }

    void delLast() {
        if(Head == null) System.out.println("empty");
        else{
            Nodes temp = Head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public static void main(String[] args) {

    }
}
