package LL;

public class LL1 {
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

        //! all methods

    public static boolean isEmpty(){
        return head==null;
    }

    public static void addFirst(int data) //O(1)----> CONSTANT
    {
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next= head;
        head=newNode;
    }
  //O(1) -------> Constant
    public static void addLast(int data){

        Node newNode = new Node(data);

        if(head==null){

            head = tail = newNode;
             return;

        }
        tail.next = newNode;
        tail = newNode;

    }

    public static void removeFirst(){
        if(isEmpty()){
            System.err.println("Linked list is empty");
            return;
        }
        // single element
        if(head.next==null){
            head = null;
        }
        head=head.next;

    }
    public static void removeLast(){
        if(isEmpty()){
            System.err.println("Linked list is empty");
            return;
        }
        // single element
        if(head.next==null){
            head = tail=null;
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }

        tail=temp;
        temp.next=null;

    }



    public static void printLL(){
        if (isEmpty()){

            System.err.println("the linked list is empty");
            return;
        }
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.err.println("null");
    }

    public static int searchIteratively(int val){

        if(isEmpty()){
            System.err.println("Linked list is Empty");
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        int i=0;
        while(temp.next!=null){
            if(temp.data==val){
                System.err.println("found at index");
                return i;
            }
            i++;
            temp=temp.next;
        }

        System.err.println("value not present");
         return Integer.MIN_VALUE;
    }
    public static int helper(Node head, int key){
        if(head==null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){

            System.err.println("Not found in Linked List :");
            return  Integer.MIN_VALUE;
        }

        return idx+1;
    }
    public static int searchRecursively(int val){
              return helper(head, val);
    }
    //! VVIP ---> REVERSE A LL
    public static void reversal(){
        Node prev =null;
        Node curr = tail = head;
        Node next;

            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head=prev;
    }

    //! DETECTING CYCLE ---->>> VVIMP

    public static boolean cycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null &&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }


    //! REMOVE CYCLE 

    public static void removecycle(){
        Node slow =head;
        Node fast=head;
        boolean cycle =false;
        while(fast!=null&&fast.next!null){
            slow = slow.next;
            fast= fast.next;
            if(fast==slow){
                cycle = true;
                break;
            }
        }
        if (cycle == false){
            return;
        }
        // finding meeting point
        slow = head;
        Node prev = null;
        while(slow!= fast){
            prev =fast;
            slow = slow.next;
            fast = fast.next;
        }
          // remove cycle
        prev.next = null;
    }
    public static void main(String[] args) {

        LL1 l= new LL1();
        l.addFirst(2);
        l.addFirst(4);
        l.addFirst(6);
        l.addLast(0);
        l.printLL();
        // l.removeLast();
        // System.err.println("");
        // l.printLL();
        // System.err.println("");
        // l.removeFirst();
        // l.printLL();
        System.out.println(l.helper(head,4));
        l.reversal();
        l.printLL();


    }
}
