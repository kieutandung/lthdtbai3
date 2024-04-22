import java.util.Scanner;

public class th1 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("size không quá 20 ");
            }
        }
        while (size > 20) ;
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhập nguyên tố" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

