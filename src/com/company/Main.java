package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        try{

            double num1, num2;


            Scanner input = new Scanner(System.in);

            System.out.println("Enter the first number");

            // take the inputs

                num1 = input.nextDouble();

                System.out.println("Enter the second number");

                num2 = input.nextDouble();



            System.out.println("Enter the operator (+,-,*,/)");

            char op = input.next().charAt(0);

            double o = 0;

            switch (op) {

                case '+':

                    o = num1 + num2;

                    break;

                case '-':

                    o = num1 - num2;

                    break;

                case '*':

                    o = num1 * num2;

                    break;

                case '/':

                    o = num1 / num2;

                    break;

                default:

                    System.out.println("You enter wrong input");

                    break;
            }


            System.out.println("The result:");

            System.out.println();

            System.out.println(num1 + " " + op + " " + num2
                    + " = " + o);

        }catch (Exception e){

        }
    }
}