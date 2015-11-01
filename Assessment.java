/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assessment;

/**
 *
 * @author Ashleigh Jones 32613
 */
import java.util.Scanner;
public class Assessment {

    /**
     * 
     */
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        /**
         * Calling each of the methods
         */
        drawInitials ();
        average ();
        checkNum ();
        calculator();
        triangle();
        split();
    }
    
    /**
     * Part A - Question 1
     * Prints out AJ using the letters
     */
    public static void drawInitials (){
        //Makes the letters go onto new lines by using \n
        System.out.print("   A   \n  A A\n A A A\nA     A\n\n");
        System.out.println("J J J J\n   J\nJ  J\nJJJJ");
    }
    
    /**
     * Part A - Question 2
     * Calculates the average of 3 user inputs 
     */
    public static void average(){
        //Asks for the user inputs then stores them as individual int numbers
        System.out.println("Please enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Please enter the third number: ");
        int thirdNumber = input.nextInt();
        //takes all 3 of the stored numbers and divides them by 3 to get the 
        //average - stores this as result
        int result = (firstNumber+secondNumber+thirdNumber)/3;
        //Prints all 3 of the numbers along with the final result
        System.out.println("The average of " + firstNumber + ", " + secondNumber
                          + " and " + thirdNumber + " is " + result);
    }
    
    /**
     * Part A - Question 3
     * Checks two inputted numbers and checks if they are in certain categories  
     */
    public static void checkNum(){
        //Asks for the user inputs then stores them as individual int numbers
        System.out.println("Please enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNumber = input.nextInt();
        
        //If statement created to categorise the numbers inputted 
        if (firstNumber>10&&secondNumber>10)
        {
            System.out.println("Both numbers are greater then 10");
        }

        else if (firstNumber<=10&&secondNumber<=10)
        {
            System.out.println("Both numbers are 10 or less");
        }

        else
        {
            System.out.println("One number is greater then 10 and one number is "
                               + "10 or less");
        }
    }
    
    /**
     * Part A - Question 4
     * Gets the user to add two numbers and a symbol then performs the sum
     */
    public static void calculator (){
        //Asks for the user inputs then stores them as individual int numbers
        System.out.println("Please enter the first number: ");
                int firstNumber = input.nextInt();
        System.out.println("Please enter the second number: ");
                int secondNumber = input.nextInt();
        //Asks for the user to input a symbol and stores it as a char
        System.out.println("Please enter a symbol: ");      
                char mySymbol = input.next().charAt(0);
        
        //A switch is created to provide a number of different cases and print 
        //out different sums depending on the users symbol input       
                switch(mySymbol){
            case '+':
                System.out.println(firstNumber+secondNumber);
                break;
            case '-':
                System.out.println(firstNumber-secondNumber);
                break;
            case '*':
                System.out.println(firstNumber*secondNumber);
                break;
            case '/':
                System.out.println(firstNumber/secondNumber);
                break;                   
     }
    }
    
    /**
     * Part A - Question 5
     * Takes an input and draws a triangle with the height and width of the number
     */
    public static void triangle (){
        //Takes the use input and stores it as an int 
        System.out.println("Please enter the size of the triangle: ");
        int triangleSize = input.nextInt();
        //for loop inside another for loop determines the position and number of
        //stars required
        for(int i=1;i<=triangleSize;i++){
            String output = "";
            for(int j=1;j<=i;j++){
                output = output + "*";   
            }
            System.out.print(output + "\n");
        }
    }
    
    /**
     * Part A - Question 6
     * Gets someone to input a word and prints out the letters on individual lines
     */
    public static void split (){
        //Takes the user input and stores it as a string
        int[]array={2,6,7,11};
        //For loop is created to establish the length of the word and then print
        //each letter on different lines
        for(int i =0;i<array.length;i++){
        int element= array[i];
        System.out.print(element*2 +",");
    }

    
}
}
