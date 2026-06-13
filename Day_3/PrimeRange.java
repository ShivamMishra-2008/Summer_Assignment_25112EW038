import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start and end values: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Prime Numbers:");

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            if (i <= 1)
                isPrime = false;
            else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime)
                System.out.print(i + " ");
        }

        sc.close();
    }
}