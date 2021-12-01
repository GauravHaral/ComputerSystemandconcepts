
import java.util.Scanner;

class CircleArea {

  public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
 
     double radius;
     final double pie = 3.14;
     double area;

     System.out.println("Enter a radius:");
     radius = scan.nextInt();
     System.out.println("radius input is:" + radius);
   
     area = pie * radius * radius;

     System.out.println("The area is " + area);

  }

}