import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner sc = new Scanner(System.in);
    /*System.out.print("Input weight in kilogram: ");*/
    double weight = sc.nextDouble();
    /*System.out.print("\nInput height in meters: ");*/
    double height = sc.nextDouble();
    double BMI = weight / (height * height);
    System.out.println(/*"Your BMI is : " +*/ String.format("%.2f", BMI));
  }
}
