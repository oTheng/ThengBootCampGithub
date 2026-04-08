package org.example;

public class MathExample {
    public static void main(String[] args) {
        double Top = 5;
        int Bottom = 10;
        int testBot = 3;
        System.out.println(Top / Bottom);
        //modulo
        System.out.println(Top % testBot);
        Top = Top + 1; //same as Top ++
        Top ++;
        Top --;

        double result = Math.pow(Top, 3);

    }
}
