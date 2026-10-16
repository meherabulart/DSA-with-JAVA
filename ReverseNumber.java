import java.util.Scanner;

public class ReverseNumber {
    public  static void print(int[] arr){
       for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
    }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n =sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Elements of an array: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=(arr.length)-1;
        System.out.print("The reverse arrray is: ");
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

            
        }
        for(int element: arr) System.out.print(element+" ");
        }
        
    
}
