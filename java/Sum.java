import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  	int FirstNumbe, SecondNumber, Sum;
    Scanner in = new Scanner (System.in);
    System.out.print("To add two number's enter first number :");
    System.out.print("Enter second number :");
    SecondNumber = in.nextInt();
    Sum = FirstNumbe + SecondNumber;
    System.out.println("The Sum of " + FirstNumbe + " and " + SecondNumber + " is " + Sum + ".");
    
  }
}
