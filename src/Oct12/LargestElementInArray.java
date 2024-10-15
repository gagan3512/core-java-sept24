package Oct12;

import java.util.Scanner;

public class LargestElementInArray {

    public static void main(Stringtest[] args) {

        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }

        int[] arr = {10,23,1,34,20};



        System.out.println("Maximum element-------------");

        int max=arr[0];
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max = arr[i];
           }

            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("maximum is " + max);
        System.out.println("minimum is " + min);

    }
}
