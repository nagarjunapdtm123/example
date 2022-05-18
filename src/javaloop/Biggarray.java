package javaloop;

public class Biggarray {
    public static void main(String[] args) {
        int arr[] = {1, 10, 27, 32, 54};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("largest number is: " +max);


//            for (int j = 1; j > arr.length; j++) {
//                if (arr[i] > arr[j])
//                    System.out.println("Biggest number is :" +arr[i]);


            }
        }

