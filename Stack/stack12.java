
public class stack12{
    // !VERY IMPORTANT
    //! use the keyword static for class defination
    // public banao ya na banao is optional
    
    public static class Node{
        int data;
        Node next;
        
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    
    // !VERY IMPORTANT.
    //! use the keyword static for class def --> VERY IMPORTANT
    // public banao ya na banao is optional

     public static class Stack{ 
        static Node head = null;

        //checking is empty or not 
        public static boolean isEmpty(){
            return head == null;
        }

        //push
        public static void push(int data) {
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
            return;   
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            return top;
        }
    }    
        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            while (!s.isEmpty()){
                 System.out.println(s.peek());
                 s.pop();
            }
        }
}
