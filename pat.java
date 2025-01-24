public class pat {

/*
!            *****
!            ****
!            ***
!            **
!            *
*/
    public static void inverted_star(){
        for(int i= 1;i <=5; i++){
            for(int j=5-i+1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

/*
!            1
!            12
!            123
!            1234
*/
    public static void pat3(){
        for(int i= 1;i <=5; i++){
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
/*
!                a
!                bc
!                def
!                ghij
*/
    public static void pat4(){
        char ch='a';
        for(int i= 1;i <=5; i++){
            for(int j=1;j<i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        // inverted_star();
        //   pat3();
           pat4();
    }
}
