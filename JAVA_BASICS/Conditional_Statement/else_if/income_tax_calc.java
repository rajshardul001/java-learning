//Write a programm for calculate the tax on salary...


import java.util.*;

public class income_tax_calc {
    public static void main(String args[]){
        System.out.println("enter the salary :");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        

        if(salary <= 500000){
            System.out.println("zero percent tax on salary...");
        }
        else if(salary >500000 && salary <= 1000000){
            System.out.println("the tax is 0.2 % which is :" + (int)(salary*0.2));
        }
        else {
            System.out.println("the tax is 0.3 % which is :" + (int)(salary*0.3));
           
        }
    }
}