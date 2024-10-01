package sept28My;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //sum of n natural no.
//        int n = sc.nextInt();
//        int sum = 0;
//        int i = 1;
//
//        do{
//            sum = sum + i;
//            i++;
//        }while(i<=n);
//
//        System.out.println("the sum of first n natural no is "+ sum);

        // print product table and factorial
//        int tableOfNumber = sc.nextInt();
//        int j=1;
//        int product = 1;
//        do {
//            product = tableOfNumber * j;
//            System.out.println(tableOfNumber + "*" + j + "=" + product);
//            j++;
//        }while(j<=10);
//
//        System.out.println("the product is " +product);


        //factorial
        int n = sc.nextInt();

        // Initialize the factorial result to 1 (as factorial of 0 and 1 is 1)
        int factorial = 1;
        int i = 1;  // Initialize counter variable

        // Use a do-while loop to calculate factorial
        do {
            factorial *= i;  // Multiply the current factorial value by i
            i++;             // Increment the counter
        } while (i <= n);    // Repeat until i exceeds n

        // Output the result
        System.out.println("The factorial of " + n + " is: " + factorial);

    }

}
