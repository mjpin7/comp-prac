import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProblemC {
	public static void main(String[] args)
	{
		// Scanner
		Scanner in = new Scanner(System.in);

		// Get the cipher as well as the secret word
		String cipher = in.next();
		String word = in.next();
		
		// Create a map, meant to store the value (shift) for every letter of the alphabet
		Map<String, Integer> myDict = new HashMap<String, Integer>();
		
		// Store the correct values in the map
		for(int i = 0; i < 26; i++)
		{
			// Use the ascii code to put the (key, value)
			myDict.put(Character.toString((char)(i + 65)), i);
		}
		
		// Empty string to hold the final message
		String message= "";
		
		// Read in the cipher text
		for(int i = 0; i < cipher.length(); i++)
		{
			// Hold the number of the character for reference
			int numChar = myDict.get(Character.toString(cipher.charAt(i)));

			// Hold the amount needed to shift in variable
			int shift = myDict.get(Character.toString(word.charAt(i)));
			
			int n;

			// If the difference is below 0 (shift > numChar) then find the correct value to correspond to the key needed
			if((numChar - shift) < 0)
			{
				n = 26 + (numChar - shift);
			}
			// Else just subtract the two to find the correct value
			else
			{
				n = numChar - shift;
			}
			
			// Loop through the map
			for(Map.Entry<String, Integer> entry: myDict.entrySet())
			{
				// If the value matches the number we calculated, store the decoded character into a variable, and append it to the end result message as well as to the end of the secret word
				if(n == entry.getValue())
				{
					String newChar = entry.getKey();
					message += newChar;
					word += newChar;
					break;
				}
			}
		}
		
		System.out.println(message);
		in.close();
	}

}
