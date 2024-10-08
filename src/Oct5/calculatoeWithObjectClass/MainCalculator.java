package Oct5.calculatoeWithObjectClass;

import java.util.Scanner;

public class MainCalculator {

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        char choice;

        do {

            System.out.println("****************");
            System.out.println("Welcome to My calcualtor");
            System.out.println("****************");
            System.out.println("Enter first number: ");
            double a = sc.nextDouble();
            System.out.println("Enter second number: ");
            double b = sc.nextDouble();
            System.out.println("1. Addition ");
            System.out.println("2. Subtraction ");
            System.out.println("3. Multiplication ");
            System.out.println("4. Division ");
            System.out.println("5. Modulus ");
            System.out.println("0. exit.  ");

            System.out.println("Enter your choice");
            int option = sc.nextInt();


            switch (option) {
                case 1:
                    System.out.println(calculator.add(a, b));
                    break;
                case 2:
                    System.out.println(calculator.subtraction(a, b));
                    break;
                case 3:
                    System.out.println(calculator.multiplication(a, b));
                    break;
                case 4:
                    System.out.println(calculator.division(a, b));
                    break;
                case 5:
                    System.out.println(calculator.modulus(a, b));
                    break;
                default:
                    System.out.println("choose the valid option");
            }
            System.out.println("Do you want to chose another option ? (y/N)");
            choice = sc.next().charAt(0);

        }while(choice == 'y' || choice == 'Y');
        System.out.println("Thank-you for using !!!!!!!!!!!! :)");
        System.out.println("calculator exited");
        sc.close();
    }
}
