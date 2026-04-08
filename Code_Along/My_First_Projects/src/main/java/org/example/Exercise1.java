package org.example;

public class Exercise1 {
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
        System.out.println(smallestNum);// question 2
        double radiusCircle = 7.25;
        double findRadiusCircle = Math.PI * Math.pow(radiusCircle, 2);
        System.out.println(findRadiusCircle); // question 3
        double numSqaure = 5;
        double rootSquare = Math.sqrt(numSqaure);
        System.out.println(rootSquare); //question 4
        int distanceNum1 = Math.subtractExact(10, 5);
        int distanceNum2 = Math.subtractExact(85, 50);
        System.out.println(distanceNum1);
        System.out.println(distanceNum2); //question 5
        double absValue = -3.8;
        double setAbsValue = Math.abs(absValue);
        System.out.println(setAbsValue); // question 6
        int number =1;


    }
}
