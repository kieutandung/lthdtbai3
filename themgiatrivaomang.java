import java.util.Arrays;
import java.util.Scanner;

public class themgiatrivaomang {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length + 1];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < b.length - 1; i++) {
            b[i] = a[i];

        }
        System.out.println("nhập giá trị cần thay:");
        b[b.length-1]= scanner.nextInt();
        System.out.print(Arrays.toString(b));
    }
}