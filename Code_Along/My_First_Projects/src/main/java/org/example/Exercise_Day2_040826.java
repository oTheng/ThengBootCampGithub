package org.example;

import java.util.Scanner;

public class Exercise_Day2_040826 {
    public static void main(String[] args) {
    String storeColor = "Red"; // EXERCISE 2, Workbook page-69
    int storeYear = 2010;
    char storeMiddle = 'Y';
    boolean storePet = false;
    String Message = "Hello everyone"; // question 1

    int dayInWeek = 7;
    double priceCoffee = 4.99;
    char favorLetter = 'Y';
    boolean isRaining = false;
        System.out.println("There is " + dayInWeek + " days in a week. On tuesday, the coffee price is at " + priceCoffee + ". However, your middle name has to start with " + favorLetter + ". Survey says " + isRaining + " today"); // question 2

        String itemName = "Apple";
        double priceTag = 7.10;
        System.out.println("you bought 3 " + itemName + " for $" + priceTag); // question 3

        // EXERCISE 3
        double bobSalary = 2321; // Step 1
        double garySalary = 12312;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary); // Question 1
        double carPrice = 13.44;
        double truckPrice = 1.33;
        double smallestNum = Math.min(carPrice, truckPrice);
        System.out.println("Finding the min of two small number is "+smallestNum);// question 2
        double radiusCircle = 7.25;
        double findRadiusCircle = Math.PI * Math.pow(radiusCircle, 2);
        System.out.println("Radius is 7, calculate :PieR^2 is "+findRadiusCircle); // question 3
        double numSqaure = 5;
        double rootSquare = Math.sqrt(numSqaure);
        System.out.println("Sqaure root of 5 is "+rootSquare); //question 4
        double distancePoints = Math.hypot(5-10, 85-50);
        System.out.println("The distance between 5,10 and 85,50 is "+distancePoints); // question 5
        double absValue = -3.8;
        double setAbsValue = Math.abs(absValue);
        System.out.println("Absolute value of -3.8 is "+setAbsValue); // question 6
        double ranDec = Math.random();
        long ranNum = 158123;
        double calRan = ranDec * ranNum;
        System.out.println(calRan+ " modulo 2 is " +calRan % 2); // question 7
        Scanner input = new Scanner(System.in);
        System.out.println("Choose how many days you want into minutes.");
        int inputDays = input.nextInt();
        int minute = 60;
        int hour = 24;
        int days = hour * inputDays;
        System.out.println(inputDays + " days into minute is " + minute * days); // question 8


    }
}
