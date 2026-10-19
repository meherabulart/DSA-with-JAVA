import java.util.Scanner;
import java.util.Arrays;
public class MinSwapsToSortBySum {
    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        int n =sc.nextInt();
        int [] arr= new  int[n];
        System.out.print("Enter the Elments of an array: ");
        for (int i=0; i<arr.length-1;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sorteed array is: ");
        print(arr);
        int sum =0;
        for (int i=0; i<arr.length;i++){
            
            sum+=arr[i];

        }
    }
    
}
