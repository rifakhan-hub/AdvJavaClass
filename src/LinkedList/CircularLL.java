package LinkedList;

class Node {
    int data;
    Node next;
}

public class CircularLL {
    Node head;
    Node tail;

    void insertFirst(int value) {
        Node n = new Node();
        n.data = value;
        n.next = head;
        if (head == null) {
            head = tail = n;
        } else {
            head = n;
            tail.next = head;
        }
    }

    void insertLast(int val) {
        Node n = new Node();
        n.data = val;
        n.next = head;
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    void delFirst() {
        if (head == null) {
            // empty
        } else {
            if (head == tail) head = tail = null;
            else {
                head = head.next;
                tail.next = head;
            }
        }
    }

    void delLast() {
        if (head == null) {
            // empty
        } else {
            if (head == tail) head = tail = null;
            else {
                Node temp = new Node();
                temp = head;
                while (temp.next.next != head) {
                    temp = temp.next;
                }
                tail = temp;
                tail.next = head;
            }
        }
    }

    public static void main(String[] args) {

    }
}
