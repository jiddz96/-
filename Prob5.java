
		
import java.util.Scanner;

public class Prob5
{
    public static void main(String args[])
    {
       Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int sum;
        int average;
        int product;
        double largest

        System.out.print("Enter First Integer: ");
        num1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        num2 = input.nextInt();

        System.out.print("Enter Third Integer: ");
        num3 = input.nextInt();
if (num1>num2 && num1 > num3) System.out.print("The largest number is:  "+num1);
else if (num2>num3 && num2>num1) System.out.print("The largest number is : "+num2);
else if (num3>num2 && num3>num1) System.out.print("The largest number is : "+num3);
}
}
