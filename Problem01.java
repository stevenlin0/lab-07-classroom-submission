import java.util.Arrays;

public class Problem01 {

    public static long getSumOfPrimes(int n) {
        // Initialize an array to mark numbers as prime or not
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        // 0 and 1 are not prime numbers
        isPrime[0] = false;
        isPrime[1] = false;

        // Iterate over each number up to the square root of n
        for (int p = 2; p * p <= n; p++) {
            // If the current number is marked as prime
            if (isPrime[p]) {
                // Mark all multiples of the current number as not prime
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Initialize the sum of prime numbers
        long sum = 0;
        // Iterate over each number up to n
        for (int i = 2; i <= n; i++) {
            // If the current number is marked as prime, add it to the sum
            if (isPrime[i]) {
                sum += i;
            }
        }

        // Return the sum of all prime numbers up to n
        return sum;
    }

    public static void main(String[] args) {
        int n = 10; // just an example input
        System.out.println("The sum of prime numbers from 1 to " + n + " is: " + getSumOfPrimes(n));
    }
}