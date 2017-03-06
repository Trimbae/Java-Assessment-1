/*
 * Name: Matthew Trimby
 * Student number:
 */
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	//initialises scanner object
    	System.out.println("Enter a word, number or phrase");
    	String userString = input.nextLine();
    	//gets user input
    	String reversedString = new StringBuilder(userString).reverse().toString();
    	//creates a variable to store the reversed string
    	System.out.println(reversedString);
    	//prints reversed string
    	if(userString.toLowerCase().equals(reversedString.toLowerCase())){
    		System.out.println("This is a Palindrome!");
    	}else{
    		System.out.println("This is not a Palindrome.");
    	//if statement to check if word/number/phrase is a palindrome, strings are both mande lower case for comparison as palindromes shouldn't be case sensetive
    	//NOTE: my program does not remove whitespace/punctuation from the user input, because if a string is not fully reversible then it does not read the same backwards as forwards.
    	}
    }
}