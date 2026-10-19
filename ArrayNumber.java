import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Convert array to number
        int num = 0;

        for (int i = 0; i < n; i++) {
            num = (num * 10 + arr[i]);
        }
        num = num + 1;
        // System.out.println("Number: " + num);

        // Step 2: Count the digits
        int temp = num;
        int count = 0;

        if (temp == 0) {
            count = 1;
        }

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Step 3: Convert number to array
        int[] newArr = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            newArr[i] = num % 10;
            num = num / 10;
        }
        
        // Step 4: Print the new array
        System.out.print("New array: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        sc.close();
    }
}

