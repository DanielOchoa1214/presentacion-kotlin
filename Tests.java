package com.dano;

import java.util.Scanner;

public class Tests {
    public static float add(float x, float y){
        return x + y;
    }

    public static float substract(float x, float y){
        return x - y;
    }

    public static float multiply(float x, float y){
        return x * y;
    }

    public static float divide(float x, float y){
        return x / y;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba la operacion que desea realizar: ");

        String operation = sc.nextLine();
        while(!operation.equals("")){
            String[] data = operation.split(" ");
            float result;
            switch(data[1]){
                case "+":
                    result = add(Float.parseFloat(data[0]), Float.parseFloat(data[2]));
                    System.out.println("El resultado es: " + result);
                    break;
                case  "-":
                    result = substract(Float.parseFloat(data[0]), Float.parseFloat(data[2]));
                    System.out.println("El resultado es: " + result);
                    break;
                case "*":
                    result = multiply(Float.parseFloat(data[0]), Float.parseFloat(data[2]));
                    System.out.println("El resultado es: " + result);
                    break;
                case "/":
                    result = divide(Float.parseFloat(data[0]), Float.parseFloat(data[2]));
                    System.out.println("El resultado es: " + result);
                    break;
            }
            operation = sc.nextLine();
        }

    }

}
