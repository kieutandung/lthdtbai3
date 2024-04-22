import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        int[][] a ={{1,2,3,4} ,{5,6,7,1}};
        int max = a[0][0];
        for (int i = 0;i < a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max)
                    max = a[i][j];
            }
        }
        System.out.println("giá trị lớn nhất :" + max);
    }
}
