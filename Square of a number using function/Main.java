import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.print(square_of_numbers(n)); // Function call
	}
    // Function to find the sum of numbers
	public static int square_of_numbers(int a)
	{  
      int result = a * a;
      return result;
	} 
}