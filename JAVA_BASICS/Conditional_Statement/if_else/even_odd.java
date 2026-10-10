//write a programm for the number is even or odd....

import java.util.*;

public class even_odd {
    public static void main(String args[]){
        System.out.println("enter the Num :");
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();

        if(Num % 2 == 0){
            System.out.println("the Num = " + Num + "  is even..." );
        }
        else{
            System.out.println("the Num = " + Num + "  is odd..." );

        }
    }
}