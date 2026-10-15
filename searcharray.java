import java.util.Scanner;

// import array.array;

// import  java.util.Arrays;

public class searcharray {
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
        System.out.println("Enter the Elements That you want to Search");
        int target= sc.nextInt();
        boolean found =false;

        for(int i=0; i<arr.length;i++){ 
            if (target==arr[i]) { System.out.println("Item found at position "+(i+1));
            found=true;
            break;
        }
        }
        if (!found)  System.out.println("Not Present in this array");
    }
}
    
    
    


