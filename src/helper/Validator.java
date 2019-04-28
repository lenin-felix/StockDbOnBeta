package helper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {
    private static Scanner scanner = new Scanner(System.in);
    public static int readInt(String message){
        int value = 0;
        boolean validValue = false;
        while (!validValue){
            try {
                System.out.print(message);
                value = scanner.nextInt();
                validValue = true;
            }catch (InputMismatchException e){
                System.out.println("Error input!");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static int readInt(String message, int min, int max){
        int value = readInt(message);
        while (value < min || value > max){
            value = readInt(message);
        }
        return value;
    }

    public static String readAlphabets(){
        String value = scanner.nextLine();
        while(!value.matches("[a-zA-Z]+")){
            System.out.println("Please enter a valid value!");
            value = scanner.nextLine();
        }
        return value;
    }

    public static float readFloat(String message){
        float value = 0;
        boolean validValue = false;
        while (!validValue){
            try {
                System.out.print(message);
                value = scanner.nextFloat();
                validValue = true;
            }catch (InputMismatchException e){
                System.out.println("Error input!");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static double readDouble(String message){
        double value = 0;
        boolean validValue = false;
        while (!validValue){
            try {
                System.out.print(message);
                value = scanner.nextDouble();
                validValue = true;
            }catch (InputMismatchException e){
                System.out.println("Error input!");
                scanner.nextLine();
            }
        }
        return value;
    }
}