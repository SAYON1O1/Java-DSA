package Stack;
import java.util.*;

public class stack1{
    public class stack{

    // !using arraylist
        static ArrayList<Integer> list = new ArrayList<>();
    
    //chacking list is empty or not
    public static boolean isEmpty(){
        return list.size() == 0; //size 0 means no element
      
    }
    
    // push
    public static void push(int data) {
        list.add(data);   // adding from last [1,2,3,4]
    } 
    
    //pop
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1); //taking the last element [1,2,3.4] -> [4]
        list.remove(list.size()-1); //deleting the last element [4]
        return top; //returning 4
    }
    //peek
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1); //returning the last element
    }
    
        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            while (!s.isEmpty()){
                 System.err.println(s.peek());
                 s.pop();
            }
        }
    }
}