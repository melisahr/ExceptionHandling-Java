import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Exception = an event that occurs during the execution of a program that,
        //  disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);

        try {
            //x variable
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            //y variable
            System.out.println("Enter a whole number to divide: ");
            int y = scanner.nextInt();

            //z
            int z = x / y;
            System.out.println("Result: " + z);
        }
        catch(ArithmeticException e) {
            System.out.println("Error. You can't divide by zero. Try again.");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid. You must enter a number.");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("This will always print");
            scanner.close();
        }
    }
}