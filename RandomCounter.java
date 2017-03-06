/*
 * Name: Matthew Trimby
 * Student number:
 */

//RandomCounter.java
// Application to generate and add up 10 random integer values between 0 and 100. As each random number is generated, it is printed to the screen. Finally the sum of the generated numbers is output. An example of a correctly formatted output is:

//86 44 77 65 73 81 86 95 72 28

//Sum of the 10 random numbers is 707
import java.util.Random;
//import random class

public class RandomCounter {

    public static void main(String[] args) {

        int randCount = 0;
        //initialise count to keep running total of random numbers
        for(int i = 1; i < 11; ++i) {
            Random random = new Random(); 
            //initialise instance of random class 
			int randNum = random.nextInt(101);
			//generate random number between 0 and 100
            System.out.print(randNum + " ");
            //prints number
            randCount += randNum;
            //Adds number to total
        }
    	System.out.println("");
        System.out.println("Sum of the 10 random numbers is " + randCount);
        //prints total of random numbers
    }    
}