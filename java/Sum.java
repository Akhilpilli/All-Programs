import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  	int FirstNumber, SecondNumber, Sum;
    Scanner in = new Scanner (System.in);
    System.out.print("To add two number's enter first number :");
    FirstNumber = in.nextInt();
    System.out.print("Enter second number :");
    SecondNumber = in.nextInt();
    Sum = FirstNumber + SecondNumber;
    System.out.println("The Sum of " + FirstNumber + " and " + SecondNumber + " is " + Sum + ".");
    
  }
}
