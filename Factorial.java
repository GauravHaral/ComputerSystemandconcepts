
import java.util.Scanner;

class Factorial {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int input = 0;
    int factorial = 1;

    System.out.println("Enter a value:");
    input = scan.nextInt();

    for (int num=input;  num>0; num--)
      factorial = factorial * num;

    System.out.println("The factorial is: " + factorial);

  }

}