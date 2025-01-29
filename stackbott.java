import java.util.*;
public class stackbott {
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

    public static void main(String[] args) {
       Stack<Integer> s= new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);

       pushAtBottom(s, 4);

       while(!s.isEmpty()){
          System.out.println(s.peek());
          s.pop();
       }
    }
}
