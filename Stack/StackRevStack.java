package Stack;
import java.util.*;
public class StackRevStack {
    public static  void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data); // passing entire stack and 4 
          // i.e pushAtBottom(s, 4)
        s.push(top);  // removes 3->2->1
    }

    public static void stackprint(Stack<Integer> s){
         while(!s.isEmpty()){
            System.out.println(s.pop());
            //s.pop();
        }
    }

    public static void stackrev(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        stackrev(s);
        pushAtBottom(s, top);
    }
    
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //System.out.println("after  reverse");
        stackrev(s);
        stackprint(s);
        //System.out.println("orignal");
    }
}
