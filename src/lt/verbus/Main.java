package lt.verbus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberA;
        char operator;
        int numberB;

        System.out.println("This is calculator. Enter number1, operator (+,-,*,/) number2");
        numberA = input.nextInt();
        operator = input.next().toCharArray()[0];
        numberB = input.nextInt();
        System.out.println(count(numberA, operator, numberB));
    }

    public static int count(int numberA, char operator, int numberB) {
        switch (operator) {
            case '+': return numberA+numberB;
            case '-': return numberA-numberB;
            case '*': return numberA*numberB;
            case '/': return numberA/numberB;
            default : throw new IllegalArgumentException();
        }
    }
}
