import java.util.*;

public class level3 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        System.out.println("PERFORMING OPERATIONS ON: " + num1 + ", " + num2);

        System.out.println("\nAddition: ");
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);

        System.out.println("\nSubtraction: ");
        int diff1 = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + diff1);
        int diff2 = num2 - num1;
        System.out.println(num2 + " - " + num1 + " = " + diff2);

        System.out.println("\nMultiplication: ");
        int product = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + product);

        System.out.println("\nDivision: ");
        try { int quo1 = num1/num2;
            System.out.println(num1 + " / " + num2 + " = " + quo1);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try { int quo2 = num2/num1;
            System.out.println(num2 + " / " + num1 + " = " + quo2);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}
