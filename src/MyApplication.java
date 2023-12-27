import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Point;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Shape shape = new Shape();

        Point point = new Point();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter coordinates of the " + (i + 1) + " point: ");

            String coordinates = scan.nextLine();
            String[] inputs = coordinates.split(" ");

            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);

            shape.add(new Point(x, y));
        }

        shape.print();
    }
}

// 1 1
// 8 0
// 9 6
// 6 9
// 0 2
// 8 7
// 4 7
// 6 5
// 2 6
// 7 2
// 0 0