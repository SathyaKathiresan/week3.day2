package week3.day2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
		String input = "Sathya";
		// convert to char array
		char[] arr = input.toCharArray();
		// create set
		Set<Character> ch = new HashSet<Character>();
		for(int i=0;i<arr.length;i++)
		{
			ch.add(arr[i]);
		}
		System.out.println(ch);

	}

}
