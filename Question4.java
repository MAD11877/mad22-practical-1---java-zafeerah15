import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner sc = new Scanner(System.in);
    System.out.print("input the integer: ");
    Integer inputint = sc.nextInt();
    for (int i = 0; i < inputint + 1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
    }
    System.out.println("");
  }
  }
}

