/*
 * Name: Matthew Trimby
 * Student number:
 */
import java.util.Scanner;
//Import scanner class
public class OddEven {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	//intialises scanner to take input
    	int evenTotal = 0;
    	int oddTotal = 0;
    	//initialises ints to keep track of odd and even totals
    	for(int i = 1; i < 6; i++){
    		System.out.print("Enter a number: ");
    		int a = input.nextInt();
    		//for loop to take 5 user ints 
    		if(a % 2 == 0){
    			evenTotal += a;
    		}else{
    			oddTotal += a;
    		}
    		//if statement to add to correct count based on if number is odd or even
    	}
    	System.out.println("Even number total: " + evenTotal);
    	System.out.println("Odd number total: " + oddTotal);
    	//neatly outputs totals
    }
}