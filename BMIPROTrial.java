/*******************************************************************************
 * By: [William_Suy]
 * Description: [This program is used as a scratch pad to create the BMI for
 *               loop in the BMI Pro]
 ******************************************************************************/
package bmi.pro.trial;

import java.util.Scanner;

public class BMIPROTrial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int weightLowInput;
        int weightLow;
        int weightHigh;
        int heightA;
        int heightB;
        int height;
        float BMI;
        
        System.out.print("Enter a height in feet and inches: ");
        heightA = input.nextInt();
        heightB = input.nextInt();
        height = (heightA * 12) + heightB;
        
        System.out.print("Enter a low weight: ");
        weightLowInput = input.nextInt();
        
        System.out.print("Enter a high weight: ");
        weightHigh = input.nextInt();
        
        System.out.println("");
        System.out.print("WEIGHT\t\t");
        System.out.print("BMI\t\t\t");
        System.out.println("CONDITION");
        /*
        for (weightLow = weightLowInput; weightLow <= weightHigh; weightLow += 5) {
            BMI = (703.0F * weightLow) / (height * height);
            
            
            String condition = null;
        
            if (BMI <= 24.0F) {
                condition = "not overweight";
            }
            else if (BMI > 24.0F) {
                condition = "overweight";
            }
            
            System.out.print(weightLow + "\t\t");
            System.out.format("%.4f", BMI);
            System.out.print("\t\t");
            System.out.println(condition);
        }
        */
        /*
        //Same thing as the for loop, but in a do while loop
        weightLow = weightLowInput;
        
        do {
            BMI = (703.0F * weightLow) / (height * height);
            
            
            String condition = null;
        
            if (BMI <= 24.0F) {
                condition = "not overweight";
            }
            else if (BMI > 24.0F) {
                condition = "overweight";
            }
            
            System.out.print(weightLow + "\t\t");
            System.out.format("%.4f", BMI);
            System.out.print("\t\t");
            System.out.println(condition);
            
            weightLow += 5;
        } while (weightLow < weightHigh);
        */
        
        //Same thing as the past loops, but in a while loop
        weightLow = weightLowInput;
        
        while (weightLow < weight High) {
            BMI = (703.0F * weightLow) / (height * height);
            
            
            String condition = null;
        
            if (BMI <= 24.0F) {
                condition = "not overweight";
            }
            else if (BMI > 24.0F) {
                condition = "overweight";
            }
            
            System.out.print(weightLow + "\t\t");
            System.out.format("%.4f", BMI);
            System.out.print("\t\t");
            System.out.println(condition);
            
            weightLow += 5;
        } 
        
    }
    
}
