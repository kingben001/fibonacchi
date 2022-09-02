
import java.util.Scanner;

public class fibonacchi
{
    public static int fibonacci(int n)
    {
        // Base case
        if (n == 0)
            return 1;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n -1) + fibonacci(n -2);
    }

    public static void main(String[] args)
    {
        // write your code here
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter n: ");
        int input = keyboard.nextInt();

        System.out.println("Fibonacci of " + input + ": " + fibonacci(input) );
    }
}