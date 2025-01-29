import java.util.*;
public class stackStringRev {
        public static String rev(String str){
            Stack<Character> s= new Stack<>();
            int temp=0;
             while(temp < str.length()){
                s.push(str.charAt(temp));
                temp++;
             }

             StringBuffer sb = new StringBuffer("");

             while(!s.isEmpty()){
                char ch = s.pop();
                sb.append(ch);
             }
             return sb.toString();
        }        
            public static void main(String args[]) {
                    String str= "abc";
                    String result = rev(str);
                    System.out.println(result);
            }
        
        

}
