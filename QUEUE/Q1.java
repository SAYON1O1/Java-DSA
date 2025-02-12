package QUEUE;
// package QUEUE;

public class Q1 {
    static class Queue{
    static int arr[];
    static int size;
    static int rear;
    static int front;

    //constructor
    Queue(int n){
        arr = new int[n];
        size=n;
        rear=-1;
        front = -1;

    }
    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    public static boolean isFull(){
        return (rear+1)%size ==  front;
    }

    //add
    public static void add(int data){
        if(isFull()){
            System.out.println("queue full");
            return;
        }

        rear = (rear +1)%size;
        arr[rear]=data;
    }

    //fifo remove
    public static int remove(){
        if(isEmpty()){
            System.err.println("empty queue");
            return -1;
        }

        int front = arr[0];
        for(int i=0; i<rear; i++){
            arr[i] = arr[i+1];
        }
        
        if (rear == front){
            rear = front = -1;

        }
        else{
            front = (front+1)%size;
        }
        return front;

    }

    public static int peek(){
        if(isEmpty()){
            System.err.println("empty queue");
            return -1;
        }

        return arr[0];

    }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(3);
        q.add(2);

        while(!q.isEmpty()){

            System.err.println(q.peek());
             q.remove();
        }
    }
}
