/*******************************************************************************
 * File: [BMIWilliamSuy]
 * By: [William_Suy]
 * Date: [02-13-2018]
 *
 * Description: [The program is to calculate the BMI of the user based on the 
 *               input from their height and weight]
 ******************************************************************************/
package bmiwilliamsuy;

//imports the Scanner to allow user inputs
import java.util.Scanner;

public class BMIWilliamSuy {

    public static void main(String[] args) {
        
        
        //allows the Scanner import to be used in this block of code under BMIWilliamSuy
        Scanner input = new Scanner(System.in);
        
        
        //string of code that introduces the program to the user
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^ Welcome to: ");
        System.out.println("^\t\tBODY MASS INDEX (BMI) Computation");
        System.out.println("^\t\t\t\t\tby William J. Suy");
        System.out.println("^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        
        //declares all varibales
        int heightft;
        int heightina;
        int heightinb;
        int height;
        int weightlb;
        float BMI;
        String results = null;
        
        
        //string of code asking the user to input their height in feet and inches
        System.out.print("Please enter height in feet and inches: "); //prints out a request for users to enter height
        heightft = input.nextInt(); //prompts user for height in ft
        heightina = input.nextInt(); //prompts user for height in in based on the initial ft input
        heightinb = (heightft * 12); //int varibale that converts the ft inputted by user into inches 
        height = (heightina + heightinb); //int variable condensing the inches in to one variable name
        
        
        //string of code asking the user to input their weight in lbs
        System.out.print("Please enter weight in pounds: "); //prints out a request for users to enter weight
        weightlb = input.nextInt(); //prompts user for weight in lbs
        
        
        //string of code computing the BMI based on the measurements given by the user
        //BMI is calculated by: (703 * [weight in lbs] / [height in inches]^2
        BMI = (703 * weightlb) / (height * height); //calcualtes the BMI with the given variables
        
        
        //determines if the BMI is considered [Healthy] or [Overweight]
       
            if (BMI <= 24) { //if the BMI is less than or equal to 24
                results = "not overweight"; //the String results will be 'not overweight'
            }
            else if (BMI >= 25) { //or else if the BMI is greater than or equal to 25
                results = "overweight"; //the String results will be 'overweight'
            }
        

        //Prints out BMI statement
        System.out.println("\nYour BMI is: " + BMI + ", which means that you are " + results + "!");
        System.out.println("The SFSU Mashouf Wellness Center is now open!\n");
        
        
        //ending statement of the program
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^\t\tThank you for using my program.");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    
}
