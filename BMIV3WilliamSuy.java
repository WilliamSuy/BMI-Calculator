/*******************************************************************************
 * File: [BMIV3WilliamSuy]
 * By: [William_Suy]
 * Date: [03-15-2018]
 *
 * Description: [The program is to calculate the BMI of the user based on the 
 *               input from their height and weight]
 ******************************************************************************/
package bmiv3williamsuy;

import java.util.Scanner;

public class BMIV3WilliamSuy {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        
        System.out.print("Please enter 1 for the Standard version and 2 for the Pro version: ");
        choice = input.nextInt();
        
        if (choice == 1) {
            bmiStd();
        }
        else if (choice == 2) {
            bmiPro();
        }
        else {
            System.out.println("\nError, please restart");
        }
    } 
    
    
    public static void bmiStd() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^ Welcome to: ");
        System.out.println("^\t\tBODY MASS INDEX (BMI) Computation");
        System.out.println("^\t\t\t\t\tby William J. Suy");
        System.out.println("^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        System.out.print("Please enter height in feet and inches: "); 
        int heightFt = input.nextInt(); 
        int heightInA = input.nextInt(); 
        int heightInB = (heightFt * 12); 
        int height = (heightInA + heightInB); 
        
        System.out.print("Please enter weight in pounds: "); 
        int weightlb = input.nextInt(); 

        float BMI = (703.0F * weightlb) / (height * height); 
        
        String results = "";
        
        if (BMI <= 24.0F) { 
            results = "not overweight"; 
        }
        else if (BMI >= 25.0F) { 
            results = "overweight"; 
        }
        
        System.out.print("\nYour BMI is: ");
        System.out.format("%.4f", BMI);
        System.out.println(", which means that you are " + results + "!");
        System.out.println("\nThe SFSU Mashouf Wellness Center is now open!\n");

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^\t\tThank you for using my program.");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    
    public static void bmiPro() {
        Scanner input = new Scanner(System.in);
        //Introduces user to the Pro Version of the program
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^ Welcome to: ");
        System.out.println("^\t\tBODY MASS INDEX (BMI) Computation PRO");
        System.out.println("^\t\t\t\t\tby William J. Suy");
        System.out.println("^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
        System.out.print("Please enter height in feet and inches: ");
        int heightFt = input.nextInt();
        int heightInA = input.nextInt();
        int heightInB = heightFt *12;
        int height = heightInA + heightInB;
                
        System.out.print("Enter the low weight in pounds: ");
        int lowWeightInput = input.nextInt();
                
        System.out.print("Enter the high weight in pounds: ");
        int highWeight = input.nextInt();
                
        System.out.println("");
        System.out.print("WEIGHT\t\t");
        System.out.print("BMI\t\t\t");
        System.out.println("CONDITION");
                
        int lowWeight;
        for (lowWeight = lowWeightInput; lowWeight <= highWeight; lowWeight+=5) {
                    
            float BMI = (703.0F * lowWeight) / (height * height);
            
            String condition = "";
        
            if (BMI <= 25.0F) {
                condition = "not overweight";
            }
            else if (BMI > 25.0F) {
                condition = "overweight";
            }
            
            System.out.print(lowWeight + "\t\t");
            System.out.format("%.4f", BMI);
            System.out.print("\t\t");
            System.out.println(condition);
        }
                
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^\t\tThank you for using my program.");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    

        
        
    
}
