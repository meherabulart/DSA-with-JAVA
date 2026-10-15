import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        boolean found = false;
        System.out.println("enter the target:");
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Target found " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                    break;

                }
            // }
            // if (found) {
            //     break;
            }
        }
        if (!found) {
            System.out.println("target not found");
        }
    }
}
