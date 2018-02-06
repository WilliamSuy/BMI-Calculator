/*******************************************************************************
 * File: [BMIWilliamSuy]
 * By: [William_Suy]
 * Date: [02-13-2018]
 *
 * Description: [The program is to calculate the BMI of the user based on the 
 *               input from their height and weight]
 ******************************************************************************/
package bmi.calculator;

//imports the Scanner to allow user inputs
import java.util.Scanner;

public class BMICalculator {

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
        String gender = null;
        String scale = null;
        double heightft;
        double heightina;
        double heightinb;
        double heightin;
        double heightcm;
        double heightm;
        double weightlb;
        double weightkg;
        double BMI = 0;
        String results = null;
        
        
        //Asks user for imperial or metric scale
        System.out.print("Compute BMI in \"metric\" or \"imperial\"?: ");
        scale = input.nextLine();
        
        
        /***********************************************************************
         ***********************************************************************
         ******************************IMPERIAL*********************************
         ***********************************************************************
         ***********************************************************************
         **********************************************************************/
        
        //string of code asking the user to input their height in feet and inches
        if ("imperial".equals(scale)) { 
        System.out.print("Please enter height in feet and inches: "); //prints out a request for users to enter height
        heightft = input.nextDouble(); //prompts user for height in ft
        heightina = input.nextDouble(); //prompts user for height in in based on the initial ft input
        heightinb = (heightft * 12); //int varibale that converts the ft inputted by user into inches 
        heightin = (heightina + heightinb); //int variable condensing the inches in to one variable name
        
        //string of code asking the user to input their weight in lbs
        System.out.print("Please enter weight in pounds: "); //prints out a request for users to enter weight
        weightlb = input.nextDouble(); //prompts user for weight in lbs
        
        //string of code computing the BMI based on the measurements given by the user
        //BMI is calculated by: (703 * [weight in lbs] / [height in inches]^2
        BMI = (703 * weightlb) / (heightin * heightin); //calcualtes the BMI with the given variables
        }
        
        /***********************************************************************
         ***********************************************************************
         ********************************METRIC*********************************
         ***********************************************************************
         ***********************************************************************
         **********************************************************************/
        
        else if ("metric".equals(scale)) {
        System.out.print("Please enter height in centimeters: "); //prints out a request for users to enter height
        heightcm = input.nextDouble(); //prompts user for height in ft
        heightm = (0.01) * (heightcm);
        
        //string of code asking the user to input their weight in kgs
        System.out.print("Please enter weight in kilograms: "); //prints out a request for users to enter weight
        weightkg = input.nextDouble(); //prompts user for weight in kgs
        
        //string of code computing the BMI based on the measurements given by the user
        //BMI is calculated by: ([weight in kg] / [height in meter]^2)
        BMI = (weightkg) / (heightm * heightm); //calcualtes the BMI with the given variables
        }
        
        
        /***********************************************************************
         ***********************************************************************
         **********************************BMI**********************************
         ***********************************************************************
         ***********************************************************************
         **********************************************************************/
            if (BMI < 18.5){
                results = "underweight";
            }
            else if (BMI >= 18.5 && BMI < 25) { 
                results = "healthy";
            }
            else if (BMI >= 25 && BMI < 30) { 
                results = "overweight"; 
            }
            else if (BMI >= 30) {
                results = "obese";
            }
        //Prints out BMI statement
        System.out.println("\nYour BMI is: " + BMI + ", which means that you are " + results + "!");
        
        
        //ending statement of the program
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^\tThank you for using the BODY MASS INDEX (BMI) Calculator.");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    
}
