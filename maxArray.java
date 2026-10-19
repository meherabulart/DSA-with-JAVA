import java.util.Scanner;
public class maxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Elements of an array: ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            // arr[i]=sc.nextInt();
            if (max<arr[i]) max=arr[i];            
        }
        System.out.println("Max element is: "+max);
    }
}
