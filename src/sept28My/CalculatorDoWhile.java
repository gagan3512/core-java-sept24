package sept28My;

import java.util.Scanner;

public class CalculatorDoWhile {
    public static void main(String[] args) {
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
                    System.out.println("Addition " + (firstNo+secondNo));
                    break;
                case 2:
                    System.out.println("Subtration " + (firstNo-secondNo));
                    break;
                case 3:
                    System.out.println("Multiplication " + (firstNo*secondNo));
                    break;
                case 4:
                    System.out.println("Division " + (firstNo/secondNo));
                    break;
                case 5:
                    System.out.println("Modulus " + (firstNo%secondNo));
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
