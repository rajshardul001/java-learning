import java.util.*;

public class type_conversion{
    public static void main(String args[]){

        System.out.println("enter the number --->>>");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        float num1 = num;
        double num2 = num;
        System.out.println("num is :"+num);
        System.out.println("num is :"+num1);
        System.out.println("num is :"+(num2+1));


    }

}