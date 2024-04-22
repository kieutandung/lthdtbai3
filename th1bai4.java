import java.util.Scanner;

public class th1bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doF;
        double doC;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. doF to doC");
            System.out.println("2. doC to doF");
            System.out.println("Exit.");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("enter doF:");
                    doF = scanner.nextDouble();
                    System.out.println("doF to doC: " + doFtodoC(doF));
                    break;
                }
                case 2: {
                    System.out.println("enter doC:");
                    doC = scanner.nextDouble();
                    System.out.println("doC to doF: " + doCtodoF(doC));
                    break;
                }
                case 0:{
                    System.exit(0);
                }
            }
        } while (choice != 0);
    }

    public static double doCtodoF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }

    public static double doFtodoC(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }
}
