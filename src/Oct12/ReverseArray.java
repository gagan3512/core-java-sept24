package Oct12;

import java.util.Scanner;

public class ReverseArray {
    public static void main(Stringtest[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse the array..........");

        for(int j=arr.length;j>=0;j--){
            System.out.print(arr[j] + " ");
        }

        //For each loop
        //for element integer in given array, print that element
        for(int element : arr){
            System.out.println(element);
        }

    }
}

