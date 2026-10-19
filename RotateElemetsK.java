import java.util.Scanner;
public class RotateElemetsK {
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
        for (int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();

        }
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }
        System.out.print("Enter the k (Number of rotation) : ");
        int k= sc.nextInt();
        k=k%n;
        System.out.print("The array Elemnts is: ");
        print(arr);
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        System.out.print("The Reverse array Elemnts with 'K' is: ");
        print(arr);
    }
    public static  void reverse(int []arr,int i,int j){
        while(i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}