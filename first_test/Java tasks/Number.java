package util;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value: ");
        String enterValue = in.nextLine();
        try {
            int convertEnterValue = Integer.parseInt(enterValue);
            getSumm(convertEnterValue);
        }
        catch (NumberFormatException test) {
            getSumm(enterValue);
        }
    }

    public static int[] generatorOfArray(){
        int lenghtOfArray = (int)(Math.random()*((10-0)+1))+0;// Генеруємо рандомне число з проміжку від 0 до 10, для довжени масиву
        int arr[] = new int[lenghtOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*((20-0)+1))+0; // Генеруємо рандомне число з проміжку від 0 до 20, для (і)-го елементу
        }
        return arr;
    }

    static void getSumm(int enterValue){
        int sumNumbersFromArrey = 0;
        int arreyOfNumner[] = generatorOfArray();
        for (int i = 0; i < arreyOfNumner.length; i++){
            sumNumbersFromArrey = sumNumbersFromArrey + arreyOfNumner[i];
        }
        System.out.println(enterValue + sumNumbersFromArrey);
    }

    static void getSumm(String enterValue){
        int sumNumbersFromArrey = 0;
        int arreyOfNumner[] = generatorOfArray();
        for (int i = 0; i < arreyOfNumner.length; i++){
            sumNumbersFromArrey = sumNumbersFromArrey + arreyOfNumner[i];
        }
        System.out.println(sumNumbersFromArrey + " " + enterValue );
    }
}
