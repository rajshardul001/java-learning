//write a programm to identify the person is addult or not...


import java.util.*;

public class adult_age {
    public static void main(String args[]){
        System.out.print("enter the age of person :");
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();

        if(Age >= 18){
            System.out.println("the person is Ault...");
        }
        else{
            System.out.println("the person is not Adult...");
    
        }
    }
}