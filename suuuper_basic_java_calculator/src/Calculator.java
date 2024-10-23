import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        
        menu();

        System.out.print("Saisissez votre choix (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Saisissez votre premier nombre: ");
        double num1 = scanner.nextDouble();

        System.out.print("Saisissez votre deuxième nombre: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Resultat: " + result);
                break;
            case 2: 
                result = substract(num1, num2);
                System.out.println("Resultat: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Resultat: " + result);
                break;
            case 4:
                result = divide(num1, num2);
                System.out.println("Resultat: " + result);
                break;
            default:
                System.out.println("Faites un choix valide");
                break;
        }
    }

    public static double add( double a, double b) {
        return a + b;
    }
    
    public static double substract( double a, double b) {
        return a - b;
    }

    public static double multiply( double a, double b) {
        return a * b;
    }

    public static double divide( double a, double b) {
        if (b != 0)
            return a / b;
        else {
            System.out.println("Error: Impossible de diviser par zero");
            return Double.NaN;
        }
    }

    public static void menu() {
        System.out.println("Choisissez une opération");
        System.out.println("1. Addition (+)");
        System.out.println("2. Soustration (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (+/");
    }
}
