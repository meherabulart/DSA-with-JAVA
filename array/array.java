package array;
import java.util.Scanner;
public class array {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of a array: ");;
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter the array Elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The array is: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}