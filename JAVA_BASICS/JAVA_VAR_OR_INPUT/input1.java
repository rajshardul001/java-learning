// AREA OF CIRCLE TAKING RAIUS INPUT......

import java.util.*;

public class input1 {

    public static void main(String args[]){
        System.out.println("enter the radius of circle --->>>");

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        float Area = (22.0f/7)*r*r;

        System.out.println("Area of circle is --->>>"+Area);
    }

}