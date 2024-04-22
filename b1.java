import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập phần tử cần xoá:");
        int x = scanner.nextInt();

        int indexDel = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                indexDel = i;
                break;
            }
        }

        if (indexDel == -1) {
            System.out.println("Phần tử " + x + " không có trong mảng.");
        } else {
            for (int i = indexDel; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;

            System.out.println("Mảng sau khi xoá phần tử " + x + ":");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
