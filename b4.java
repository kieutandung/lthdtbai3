import java.util.Arrays;
import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài mảng:");
        int arr = scanner.nextInt();
        int[] newarr = new int[arr];
        for (int i = 0 ; i < newarr.length; i++) {
            newarr[i] = scanner.nextInt();
        }
            int min = newarr[0];
            for (int i = 1; i < newarr.length; i++){
                if (newarr[i] < min) {
                    min = newarr[i];
            }
        }
        System.out.println(Arrays.toString(newarr));
        System.out.println(min);
    }
}
