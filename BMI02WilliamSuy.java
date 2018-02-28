/*******************************************************************************
 * File: [BMI02WilliamSuy]
 * By: [William_Suy]
 * Date: [02-27-2018]
 *
 * Description: [The program is to calculate the BMI of the user based on the 
 *               input from their height and weight along with a PRO version]
 ******************************************************************************/
package bmi02williamsuy;

import java.util.Scanner;

public class BMI02WilliamSuy {


    public static void main(String[] args) {
        
        //creates scanner object
        Scanner input = new Scanner(System.in);
        
        //prompts user to choose version of program
        System.out.print("Please enter 1 for the Standard version and 2 for the Pro version: ");
        int version = input.nextInt();
        
        switch (version) {
            //Case 1 will be the Standard version
            case 1: 
                //Introduces user to the Standard version
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^ Welcome to: ");
                System.out.println("^\t\tBODY MASS INDEX (BMI) Computation");
                System.out.println("^\t\t\t\t\tby William J. Suy");
                System.out.println("^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
                //string of code asking the user to input their height in feet and inches
                System.out.print("Please enter height in feet and inches: "); //prints out a request for users to enter height
                int heightFtSt = input.nextInt(); //prompts user for height in ft
                int heightInASt = input.nextInt(); //prompts user for height in in based on the initial ft input
                int heightInBSt = (heightFtSt * 12); //int varibale that converts the ft inputted by user into inches 
                int heightSt = (heightInASt + heightInBSt); //int variable condensing the inches in to one variable name
        
                //string of code asking the user to input their weight in lbs
                System.out.print("Please enter weight in pounds: "); //prints out a request for users to enter weight
                int weightlb = input.nextInt(); //prompts user for weight in lbs

                //string of code computing the BMI based on the measurements given by the user
                //BMI is calculated by: (703 * [weight in lbs] / [height in inches]^2
                float BMISt = (703.0F * weightlb) / (heightSt * heightSt); //calcualtes the BMI with the given variables
                
                
                //determines if the BMI is considered [Healthy] or [Overweight]
                //stores the variable results into null in order to store a value from the if/else statement
                String results = null;
                //if else statement to display 'overweight' or 'not overweight'
                    if (BMISt <= 24.0F) { //if the BMI is less than or equal to 24
                        results = "not overweight"; //the String 'results' will be 'not overweight'
                    }
                    else if (BMISt >= 25.0F) { //or else if the BMI is greater than or equal to 25
                        results = "overweight"; //the String 'results' will be 'overweight'
                    }
        
                //Prints out BMI statement
                System.out.print("\nYour BMI is: ");
                System.out.format("%.4f", BMISt);
                System.out.println(", which means that you are " + results + "!");
                System.out.println("\nThe SFSU Mashouf Wellness Center is now open!\n");

                //ending statement of the program
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^\t\tThank you for using my program.");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                break;
            
            //Case 2 will be the Pro version
            case 2: 
                //Introduces user to the Pro Version of the program
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^ Welcome to: ");
                System.out.println("^\t\tBODY MASS INDEX (BMI) Computation PRO");
                System.out.println("^\t\t\t\t\tby William J. Suy");
                System.out.println("^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
                //prompts user for height in feet and inches
                System.out.print("Please enter height in feet and inches: ");
                int heightFtPro = input.nextInt();
                int heightInAPro = input.nextInt();
                int heightInBPro = heightFtPro *12;
                int heightPro = heightInAPro + heightInBPro;
                
                System.out.print("Enter the low weight in pounds: ");
                int lowWeightInput = input.nextInt();
                
                System.out.print("Enter the high weight in pounds: ");
                int highWeight = input.nextInt();
                
                float BMIPro;
                int lowWeight;
                
                //Header of the list in BMI Pro
                System.out.println("");
                System.out.print("WEIGHT\t\t");
                System.out.print("BMI\t\t\t");
                System.out.println("CONDITION");
                
                //a For statement to list out the BMI in increments of 5
                for (lowWeight = lowWeightInput; lowWeight <= highWeight; lowWeight+=5) {
                    
                    BMIPro = (703.0F * lowWeight) / (heightPro * heightPro);
            
                    String condition = null;
        
                    if (BMIPro <= 25.0F) {
                        condition = "not overweight";
                    }
                    else if (BMIPro > 25.0F) {
                        condition = "overweight";
                    }
            
                    System.out.print(lowWeight + "\t\t");
                    System.out.format("%.4f", BMIPro);
                    System.out.print("\t\t");
                    System.out.println(condition);
                }
                
                
                //ending statement of the program
                System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^\t\tThank you for using my program.");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
                break;
                
            //Default will return an error if the input is != 1 || 2
            default:
                System.out.println("\nI'm sorry, that is an invalid value. Please restart.");
                break;
        }
        
    }
    
}
