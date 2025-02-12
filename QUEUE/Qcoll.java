package QUEUE;
import java.util.*;

public class Qcoll {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(4);
        q.add(3);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
    }
    
}
