package util;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws Exception {
       int number = readFromFile();
       writeToFile(number);
    }
    public static int readFromFile() throws Exception {
        FileReader fileFromRead = new FileReader("D:\\delete 12.01\\first_test\\src\\main\\java\\util\\lectorium1.txt");
        Scanner scan = new Scanner(fileFromRead);
        int number = Integer.parseInt(scan.nextLine());
        System.out.println(number);
        fileFromRead.close();
        return(number);
    }
    public static void writeToFile(int number) throws Exception {
        FileWriter fileToWrite = new FileWriter("D:\\delete 12.01\\first_test\\src\\main\\java\\util\\lectorium2.txt");
        number = number * number;
        String numberForWrite= Integer.toString(number);
        fileToWrite.write(numberForWrite);
        fileToWrite.flush();
        fileToWrite.close();
    }

}
