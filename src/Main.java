import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point of Line 1 (x1 y1):");
        double x1Line1 = scanner.nextDouble();
        double y1Line1 = scanner.nextDouble();
        System.out.println("Enter the coordinates of the second point of Line 1 (x2 y2):");
        double x2Line1 = scanner.nextDouble();
        double y2Line1 = scanner.nextDouble();

        System.out.println("Enter the coordinates of the first point of Line 2 (x1 y1):");
        double x1Line2 = scanner.nextDouble();
        double y1Line2 = scanner.nextDouble();
        System.out.println("Enter the coordinates of the second point of Line 2 (x2 y2):");
        double x2Line2 = scanner.nextDouble();
        double y2Line2 = scanner.nextDouble();

        double lengthLine1 = calculateLineLength(x1Line1, y1Line1, x2Line1, y2Line1);
        double lengthLine2 = calculateLineLength(x1Line2, y1Line2, x2Line2, y2Line2);

        System.out.println("Length of Line 1: " + lengthLine1);
        System.out.println("Length of Line 2: " + lengthLine2);

        int comparisonResult = Double.compare(lengthLine1, lengthLine2);

        if (comparisonResult == 0) {
            System.out.println("The two lines are equal in length.");
        } else if (comparisonResult < 0) {
            System.out.println("Line 1 is shorter than Line 2.");
        } else {
            System.out.println("Line 1 is longer than Line 2.");
        }
    }

    private static double calculateLineLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}