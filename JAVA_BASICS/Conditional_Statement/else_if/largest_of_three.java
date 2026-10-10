//Write a programm for the finding of largest number from three numbers....

import java.util.*;

public class largest_of_three {
    public static void main(String args[]){
        System.out.println("enter the three numbers :");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A > B && A > C ){
            System.out.println("A IS LARGE NUMBER THAN BOTH...");
        }
        else if(B > A && B > C){
            System.out.println("B IS LARGE NUMBER THAN BOTH...");
        }
        else{
            System.out.println("C IS LARGE NUMBER THAN BOTH...");
        }
    }
}