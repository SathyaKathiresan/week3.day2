package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		Integer[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		//converting to set
		Set<Integer> num = new TreeSet<Integer>(Arrays.asList(numbers));
		System.out.println("The Set values : " + num);
		//converting to list 
		List<Integer> list = new ArrayList<Integer>(num);
		//finding missing num
		for(int i=0;i<list.size();i++) {
			if(list.get(i)!=(i+1))
			{
				System.out.println("Mising num is : " + (i+1));
				break;
			}
		}
		

	}

}
