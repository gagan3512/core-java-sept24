package sept28My.loops;

import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                System.out.print(" " + (j * i) );
            }
            System.out.println();
        }
    }
}

