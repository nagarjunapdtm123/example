package javaloop;

public class Duplicate {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,1,2,7,8,45,78,45};
        System.out.println("Duplicate elements in an array :");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j])

                    System.out.println(arr[j]);
            }
        }
    }
}
