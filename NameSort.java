/*
 * Name: Matthew Trimby	
 * Student number: 
 */
import java.util.Scanner;
import java.util.Arrays;
public class NameSort {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	//initialises scanner
    	System.out.println("Enter 3 names to sort: ");
    	String a = input.nextLine();
    	String b = input.nextLine();
    	String c = input.nextLine();
    	//Takes user input

    	String[] names = {a, b, c};
    	Arrays.sort(names);
    	//initialises array with name varialbles and then sorts

    	for(int i = 0; i < names.length; i++){
    		System.out.println(names[i]);
    		//for loop to output the names
    	}



    }
}