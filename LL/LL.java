package LL;

public class LL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head; // also can write static head
    public static Node tail; //also can write static tail

    public static void main(String[] args) {
        LL ll =new LL();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
    }
}
