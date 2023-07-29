import java.io.*;
import java.util.Scanner;

class janitortroubles
{
    static double maxArea(double a, double b,
                          double c, double d)
    {
        // Calculating the semi-perimeter
        // of the given quadrilateral
        double semiperimeter = (a + b + c + d) / 2;

        // Applying Brahmagupta's formula to
        // get maximum area of quadrilateral
        return Math.sqrt((semiperimeter - a) *
                (semiperimeter - b) *
                (semiperimeter - c) *
                (semiperimeter - d));
    }

    // Driver code
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a = input.nextInt(), b = input.nextInt(),
                c = input.nextInt(), d = input.nextInt();
        System.out.println(maxArea(a, b, c, d));
    }
}