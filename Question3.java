import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner sc = new Scanner(System.in);
    System.out.print("input the integer: ");
    Integer inputint = sc.nextInt();
    double multiplyint = inputint*inputint;
    System.out.println("Your multiplied integer is : " + multiplyint);
  }
}
