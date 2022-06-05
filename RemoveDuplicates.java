package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicates {
	String text = "We learn java basics as part of java sessions in java week1";
	String[] words =  text.split(" ");
	int count = words.length;
	
	public void hashset() {
	
	HashSet<String> list = new HashSet<String>();	
	for(int i=0; i<count; i++) {
		list.add(words[i]);
	}
	System.out.println(list);
	}

	public void linkedHashset() {
		
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		for(int i=0; i<count; i++) {
			list.add(words[i]);
		}
		System.out.println(list);
	}
		
public void treeSet() {
		
		TreeSet<String> list = new TreeSet<String>();
		for(int i=0; i<count; i++) {
			list.add(words[i]);
		}
		System.out.println(list);
		}
		
	public static void main(String[] args) {
		RemoveDuplicates objDup = new RemoveDuplicates();
		objDup.hashset();
		objDup.linkedHashset();
		objDup.treeSet();

}
}