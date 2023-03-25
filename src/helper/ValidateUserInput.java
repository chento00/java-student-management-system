package helper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidateUserInput {
    public static boolean isCorrect(String opt){
        try {
            int option=Integer.valueOf(opt);
            return  true;
        }catch (NumberFormatException e){
            System.out.println("Input Integer only ,but "+e.getMessage().toLowerCase()+" can not");
        }
        return false;
    }
    public static Integer valueInputInteger(Scanner scanner,String message){
        do {
            try {
                System.out.print("Enter "+message+" : ");
                return scanner.nextInt();
            }catch (InputMismatchException ex){
                System.out.println("Input Integer only");
            }
            scanner.nextLine();
        }while (true);
    }
    public static Float valueInputFloat(Scanner scanner,String message){
        do {
            try {
                System.out.print("Enter "+message+" : ");
                return scanner.nextFloat();
            }catch (InputMismatchException ex){
                System.out.println("Input Integer only" +ex.getMessage());
            }
            scanner.nextLine();
        }while (true);
    }
    public static boolean isEmpty(String option){
        return option.isEmpty();
    }
}
