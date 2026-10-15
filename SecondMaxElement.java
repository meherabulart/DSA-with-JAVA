import java.util.Scanner;
public class SecondMaxElement {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n =sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Elements of an array: ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            sc.close();
            return;
        }
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            // arr[i]=sc.nextInt();
            if (max<arr[i]) max=arr[i];
            
        }
        int SecondMaxElement=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(SecondMaxElement<arr[i] && arr[i]!=max){
                SecondMaxElement=arr[i];                
            }
            
        }
        System.out.println("Second Max element is: "+SecondMaxElement);
    }
}
    

