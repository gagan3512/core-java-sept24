package Oct5.calculatorObjectClassWithSeperateClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Division division = new Division();
        Multiplication multiplication = new Multiplication();
        Modulus modulus = new Modulus();

        Scanner sc = new Scanner(System.in);

        char choice;
        do {
            System.out.println("*******");
            System.out.println("Welcome to calculator");
            System.out.println("********");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("0 Exit");

            System.out.println("Enter your choice");
            int option = sc.nextInt();
            if (option == 0) {
                break;
            }

            System.out.println("Enter first no");
            double firstNo = sc.nextInt();
            System.out.println("Enter second no");
            double secondNo = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Addition " + addition.sum(12,5,3));
                    break;
                case 2:
                    System.out.println("Subtration " + subtraction.subtraction(34,12));
                    break;
                case 3:
                    System.out.println("Multiplication " + multiplication.multiplication(12,34));
                    break;
                case 4:
                    System.out.println("Division " + division.division(34,13));
                    break;
                case 5:
                    System.out.println("Modulus " + modulus.modulus(12,45,66));
                    break;
                default:
                    System.out.println("choose the valid option");
            }
            System.out.println("Do you want to chose another option ? (y/N)");
            choice = sc.next().charAt(0);

        }while(choice == 'y' || choice == 'Y');

        System.out.println("calculator exited");
        sc.close();
    }
}
