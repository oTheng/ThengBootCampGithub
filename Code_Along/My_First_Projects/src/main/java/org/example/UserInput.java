package org.example;

import java.io.InputStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UserInput {
    public static void main(String[] args) {
  /**  Scanner newScanner = new Scanner(System.in);
    String userInput = newScanner.nextLine();
        System.out.println(userInput); **/
  System.out.println("Choose a number between 0 - 10");
Scanner Input = new Scanner(System.in);
int UserInputNum = Input.nextInt();
if (UserInputNum < 0){
    System.out.println("You can not put a number below 0");
    UserInputNum = 0;
}

if (UserInputNum > 10){
    System.out.println("You can't choose a number over 10");
    UserInputNum = 0;

}

if (UserInputNum != 0) {
    System.out.println("Your number is " + UserInputNum);}
else {
    System.out.println("Error Found: 404");}

    }
}