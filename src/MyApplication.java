import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Shape shape = new Shape();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter coordinates of the " + (i + 1) + " point: ");

            String coordinates = scan.nextLine();
            String[] inputs = coordinates.split(" ");

            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);

            shape.add(new Point(x, y));
        }

        shape.printCharacteristics();
    }
}