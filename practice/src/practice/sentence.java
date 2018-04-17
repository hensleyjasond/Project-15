package practice;

import java.util.HashSet;
import java.util.Iterator;

public class sentence {
	
	public static void main(String[] args) {
		
		HashSet<String> word = new HashSet<String>();
		
		word.add("I'm");
		word.add("here");
		word.add("for");
		word.add("Extra");
		word.add("Credit");
		
		Iterator<String> i = word.iterator();
		
		while(i.hasNext());
			System.out.println(i.next());
		
	}

}
