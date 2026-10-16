
import java.util.Scanner;

public class segreagate0s1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        System.out.println("Array after segregation:");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}
