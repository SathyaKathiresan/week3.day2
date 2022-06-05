package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
	List<Integer> arr = new ArrayList<Integer>();
	arr.add(1);
	arr.add(2);
	arr.add(3);
	arr.add(4);
	arr.add(7);
	arr.add(6);
	arr.add(8);
	Collections.sort(arr);
	for(int i=1; i<arr.size(); i++) {
		if(arr.get(i-1)!=i) {
			System.out.println("Missing Element is : " + i);
			break;
		}
	}
	
	}

}
