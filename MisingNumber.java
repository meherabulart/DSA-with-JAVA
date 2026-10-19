import java.util.Scanner;
public class MisingNumber {
    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();
        int [] arr= new int[n];
        System.out.print("Enter the Elments of an array: ");
        for (int i=0; i<arr.length-1;i++){
            arr[i]= sc.nextInt();

        }
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }
        int sum =0;
        for (int i=0; i<arr.length;i++){
            sum+=arr[i];
            }
        System.out.println("Sum of the array Elements: "+sum);
        int totalSum=(n*(n+1)/2);
        int misnum=totalSum-sum;
        System.out.println("Mising Element is :"+misnum);
    }
}
