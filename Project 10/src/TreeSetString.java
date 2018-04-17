import java.util.Scanner;//importing scanner
import java.util.TreeSet;//importing treeset
import java.util.Arrays;
/*
 * Jason Hensley
 * COP 3330
 * 16.20 (Sorting Words with a TreeSet) Write a program that uses a String method split to tokenize 
 * a line of text input by the user and places each token in a TreeSet. Print the elements of the 
 * TreeSet. [Note: This should cause the elements to be printed in ascending sorted order.]
 */
public class TreeSetString {

	public static void main(String[] args) {					//main function
		
		
		
		
		Scanner scanner = new Scanner(System.in);				//scanner for input
		System.out.println("Enter a string of words please. "); //asking user for input
		String userInput = scanner.nextLine();					//setting the scanner for the token of the string
		
		String [] tokenized = userInput.split(" ");				//breaks the token up by each word with a space
		
		TreeSet <String> treeSet = new TreeSet<>();				//treeset is the String type
		
		treeSet.addAll(Arrays.asList(tokenized));				//the token list array is passed into treeset, all words are added
		
		for(String word: treeSet) {								//for each of the treeset words, out puts them to screen in a-z order
			
//			System.out.println("Words put into a treeset: Ascending: ");//outputs a statement
			System.out.println("Next word in the treeset array: " +word);
			
//			for(int i = 0; i<tokenized.length; i++) {
//				System.out.println(tokenized[i]);
//			
			
//			
//		}
		
		}
		scanner.close();										//closes my scanner
	}

}
