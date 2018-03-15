/*******************************************************************************
 * File: [BMIV3WilliamSuy]
 * By: [William_Suy]
 * Date: [03-15-2018]
 *
 * Description: [The program is to calculate the BMI of the user based on the 
 *               input from their height and weight]
 ******************************************************************************/
package bmimethods;

import java.util.Scanner;

public class BMIMethods {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        selection();
        repeat();
        
    } 
    
    public static void selection() {
        Scanner input = new Scanner(System.in);
        byte selection = 0;
        
        do {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.print("Please enter 1 for Standard Version or 2 for Pro Version: ");
            selection = input.nextByte();
        } 
        while (selection != 1 && selection !=2);
        
        if (selection == 1) {
            bmiStd();
        }
        if (selection == 2) {
            bmiPro();
        }
    }
    
    public static void repeat() {
        Scanner input = new Scanner(System.in);
        
        String repeat = "";

        while (!"yes".equalsIgnoreCase(repeat) && !"no".equalsIgnoreCase(repeat)) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.print("\nDo you want to run the program again? (yes or no): ");
            repeat = input.next();
        }
        
        if ("yes".equalsIgnoreCase(repeat)) {
            System.out.println("");
            selection();
            repeat();
        }

        if ("no".equalsIgnoreCase(repeat)) {
            System.out.println("\nThank you for using my program!");
        }
    }
    
    public static void bmiStd() {
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^ Welcome to: ");
        System.out.println("^\t\tBODY MASS INDEX (BMI) Computation");
        System.out.println("^\t\t\t\t\tby William J. Suy");
        System.out.println("^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        int height = setHeight();
        int weight = setWeight();
        
        System.out.print("\nYour BMI is: ");
        System.out.format("%.4f", getBMI(height, weight));
        System.out.println(", which means that you are " + 
                getResults(getBMI(height, weight)) + "!");
        System.out.println("\nThe SFSU Mashouf Wellness Center is now open!\n");
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
                
        int height = setHeight();
        int weightLow = setWeightLow();
        int weightHigh = setWeightHigh(); 
                
        System.out.println("");
        System.out.print("WEIGHT\t\t");
        System.out.print("BMI\t\t\t");
        System.out.println("CONDITION");
                
        int lowWeight;
        for (lowWeight = weightLow; lowWeight <= weightHigh; lowWeight+=5) {
                    
            System.out.print(lowWeight + "\t\t");
            System.out.format("%.4f", getBMI(height, weightLow));
            System.out.print("\t\t");
            System.out.println(getResults(getBMI(height, weightLow)));
        }
    }
    
    public static int setHeight() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter height in feet and inches: "); 
        int heightFt = input.nextInt(); 
        int heightInA = input.nextInt(); 
        int heightInB = (heightFt * 12); 
        int height = (heightInA + heightInB); 
        
        return height;
    }
    
    public static int setWeight() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter weight in pounds: "); 
        int weight = input.nextInt();
        
        return weight;
    }
    
    public static int setWeightLow() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a low weight in pounds: "); 
        int weight = input.nextInt();
        
        return weight;
    }
    
    public static int setWeightHigh() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a high weight in pounds: "); 
        int weight = input.nextInt();
        
        return weight;
    }
    
    public static float getBMI(int height, int weight) {
        float BMI = (703.0F * weight) / (height * height); 
        return BMI;
    }
    
    public static String getResults(float BMI) {
        String results = "";
        
        if (BMI <= 24.0F) { 
            results = "not overweight"; 
        }
        else if (BMI >= 25.0F) { 
            results = "overweight"; 
        }
        return results;
    }
    
}