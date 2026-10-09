/*Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/

import java.util.*;

public class input4 {
    public static void main(String args[]) {
        System.out.println("enter the the price of three items: ");
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float bill = ((pencil + pen + eraser)/18)*100;
        System.out.print("your bill with gst is :"+ bill );
    }
}