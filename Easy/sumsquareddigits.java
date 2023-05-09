import java.util.Scanner;
public class sumsquareddigits {
    public static int sumSquaredDigits(int n, int base) {
        /* Computes the Sum Squared Digits function of n in the given base */
        int sum = 0;
        while (n > 0) {
            int digit = n % base;
            sum += digit * digit;
            n /= base;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of datasets
        int numDatasets = sc.nextInt();

        // Process each dataset
        for (int i = 1; i <= numDatasets; i++) {
            // Read the dataset parameters
            int datasetNum = sc.nextInt();
            int base = sc.nextInt();
            int n = sc.nextInt();

            // Compute the Sum Squared Digits function
            int result = sumSquaredDigits(n, base);

            // Print the result
            System.out.println(datasetNum + " " + result);
        }
    }
}
