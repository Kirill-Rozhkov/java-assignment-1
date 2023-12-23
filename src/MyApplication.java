import java.util.Scanner;
import java.awt.Point;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Введите координаты " + i + " точки: ");
            int x, y = scan.nextInt();
        }
    }
}