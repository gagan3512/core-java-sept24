package sept28My.loops;

import java.util.Scanner;

public class cassinoGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        int luckNumber = 22;
        int noOfAttempt = 3;
        do {
            for (int i = 0; i < noOfAttempt; i++) {
                System.out.println("Choose your number");
                int number = sc.nextInt();
                if (number == luckNumber) {
                    System.out.println("You Won!!!!");
                    break;
                } else {
                    System.out.println("Sorry you loss........try again");
                }
            }
            System.out.println("Game is Finished !!");
            System.out.println("If you want to play again , press y for yes and n for no");
            ch = sc.next().charAt(0);

        }while(ch=='y' || ch=='n');
    }
}
