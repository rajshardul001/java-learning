//Write the programm for finding the largest number from two numbers....

import java.util.*;

public class Largest_of_two_num {
    public static void main(String args[]){
        System.out.println("enter the two numbers: ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B){
            System.out.println("A is larger than the B");
        }
        else{
            System.out.println("B is larger than A");
        }


    }
}