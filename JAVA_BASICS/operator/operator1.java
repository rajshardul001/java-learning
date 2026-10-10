/*write programm in that take a two inputa A and B as a operand
 and perform the arithmetic operation on them....*/

import java.util.*;

public class operator1 {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println("ADDITION IS :" + A+B);
        System.out.println("SUBSTRACTION IS :" + (A-B));
        System.out.println("MULTIPLICATION IS :" + A*B);
        System.out.println("DIVISION IS :" + A/B);
        System.out.println("MODULO IS :" + A%B);
    }
}