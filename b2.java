import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length;i++){
            c[i] = a[i];
        }
        for (int j =0;j < b.length;j++){
            c[ a.length +j] = b[j];
        }
        System.out.println("mảng sau khi gộp:");
        for (int k = 0;k < c.length;k++){
            System.out.print(c[k] + " ");
        }
    }
}
