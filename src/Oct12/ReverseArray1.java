package Oct12;

import java.util.Scanner;

public class ReverseArray1 {

    public static void main(Stringtest[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
        System.out.println("Display the elements ");

        for(int elements : arr){
            System.out.println(elements);
        }

    }
}
