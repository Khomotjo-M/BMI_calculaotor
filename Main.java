package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

userInput();
        Scanner tim = new Scanner(System.in);

        float height = tim.nextInt();
        float weight = tim.nextFloat();

bmiValidation(height,weight);

    }
    public static void userInput(){

        System.out.println(" height in Kgs:");
        System.out.println("weight in Mas:");



    }
    public static void bmiValidation(float height,float weight){
        float bmi = height/(weight*weight);
        System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi > 18.5 && bmi <25) {
            System.out.println("Normal BMI");
        } else if (bmi > 25 && bmi<30) {
            System.out.println("Overweight");
        } else if (bmi >30 ) {
            System.out.println("Obese");

        }
    }
}