/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author serjhk
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        float a = input.nextFloat();
        System.out.println("Enter second number");
        float b = input.nextFloat();
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.MUL");
        System.out.println("4.DIV");
        System.out.println("Enter your choice");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("The result is" + result);
    }
}

// TODO code application logic here
}
    
}
