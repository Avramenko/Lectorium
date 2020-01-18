package util;

import java.util.Scanner;

public class Recur {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value: ");
        int enterValue = in.nextInt();
        switch (enterValue) {
            case 1: funcRecursion(1);
                break;
            case 2: funcRecursion(2);
                break;
            case 3: funcRecursion(3);
                break;
            case 4: funcRecursion(4);
                break;
            case 5: funcRecursion(5);
                break;
            case 6: funcRecursion(6);
                break;
            case 7: funcRecursion(7);
                break;
            case 8: funcRecursion(8);
                break;
            case 9: funcRecursion(9);
                break;
        }

    }
    public static int funcRecursion(int number){
        int recursion;

        if (number == 1){
            System.out.print(number + " ");
            return number;
        }
        else {
            recursion = funcRecursion(number - 1);
            System.out.print(number + " ");
            return recursion;
        }
    }
}
