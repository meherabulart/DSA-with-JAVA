import java.util.Scanner;

public class mularray {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n =sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter the array Elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The array is: ");
        int mul=1;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            mul*=arr[i];
        }
        System.err.println();
        System.out.print("Multiply of array Elements is: "+mul+" ");
    }
}
