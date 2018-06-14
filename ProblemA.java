import java.util.ArrayList;
import java.util.Scanner;

public class ProblemA {
	
	public static void main(String[] args)
	{
		// Initialize variables
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> myListIn = new ArrayList<Integer>();
		
		// Take in the number of loopd
		int numLoops = in.nextInt();

		
		// Get inputs
		for(int i = 0; i < numLoops; i++) {
			myListIn.add(in.nextInt());
		}
		
		
		// Go through inputs and calculate b0 and b1
		for(int i = 0; i < myListIn.size(); i++)
		{
			// Get number of 1s in t e decimal binary string
			String bin1 = Integer.toBinaryString(myListIn.get(i));
			int b1 = bin1.length() - bin1.replace("1", "").length();		
			
			// Get the hex number
			long hexNum = Long.parseLong(Integer.toString(myListIn.get(i)),  16);		
			
			// Get binary num and number of 1s in hex version
			String bin2 = Long.toBinaryString(hexNum);
			int b2 = bin2.length() - bin2.replace("1", "").length();
			
			
			System.out.println(b1 + " " + b2);
			
		}
		
		in.close();
	}

}
