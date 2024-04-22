import java.util.Scanner;

public class th4 {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        size = scanner.nextInt();

        while (size > 30) {
            System.out.println("Size should not exceed 30.");
            System.out.print("Enter the size: ");
            size = scanner.nextInt();
        }

        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        System.out.print("List of marks: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10) {
                count++;
            }
        }
    }
}
