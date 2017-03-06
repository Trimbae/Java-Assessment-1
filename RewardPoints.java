/*
 * Name: Matthew Trimby
 * Student number: 
 */
import java.util.Scanner;

public class RewardPoints {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	//Initialises scanner
    	System.out.print("Please enter the amount of money you have spent: ");
    	float points = input.nextFloat();
    	//Takes user input as a float to allow for decimals
    	if(points <= 100){
    		System.out.println("100 points");
    	}else if(100 < points && points <= 250){
    		System.out.println("250 points");
    	}else if(250 < points && points <= 500){
    		System.out.println("500 points");
    	}else if(500 < points && points <= 1000){
    		System.out.println("1000 points");
    	}else if(points > 1000){
    		System.out.println("1500 points");
    	}else{
    		System.out.println("Not a valid number");
    		//series of if statements to determine number of points based on user input
    	}

    }
}