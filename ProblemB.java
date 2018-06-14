import java.util.Scanner;

public class ProblemB {
	
	public static void main(String[] args)
	{
		// Scanner for input
		Scanner in = new Scanner(System.in);
		
		// Get the input (number of loops)
		int num = in.nextInt();
		double total = 0;
		
		
		for(int i = 0; i < num; i++)
		{
			// Get the incline/decline
			double num1 = in.nextDouble();

			// Get the distance
			double num2 = in.nextDouble();
			
			// To calculate the height, the formula for right angle triangle is Sin(A) = height/hyp... Therefore Sin(A) * hyp = height
			// Add to total and loop again
			total += Math.sin(Math.toRadians(num1)) * num2;
		}
		
		// Print to two decimal places
		System.out.printf("%.2f", total);
		in.close();
	}

}
