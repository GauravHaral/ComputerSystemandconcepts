import java.util.Scanner;
import java.util.Random;

class Multiply {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int input=0;

    Random  myRandomNumber = new Random();
    int myOneDigitNumber = Math.abs( myRandomNumber.nextInt() % 10 );
    int mySecDigitNumber = Math.abs( myRandomNumber.nextInt() % 10 );
    int answer;

    // System.out.println("num1=" + myOneDigitNumber + " num2=" + mySecDigitNumber);

  while (input != -1) {
    answer = myOneDigitNumber * mySecDigitNumber;

    System.out.println("what is " + myOneDigitNumber + " x " + mySecDigitNumber + "= or -1 to quit");
    input = scan.nextInt();

    if (input == answer) {
      // generate two new numbers if correct
      System.out.println("correct");
      myOneDigitNumber = Math.abs( myRandomNumber.nextInt() % 10 );
      mySecDigitNumber = Math.abs( myRandomNumber.nextInt() % 10 );
    } else {
      if (input != -1)
        System.out.println("incorrect");
    }
  }

    


  }

}