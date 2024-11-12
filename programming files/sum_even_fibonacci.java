// Sums even fibonacci numbers under 4,000,000

public class sum_even_fibonacci {
    public static void main(String[] args) {
        int a = 1, b = 0;
        int sumEven = 1;
        while (b < 4000000) {
            if (b % a == 0) {
                sumEven += b;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(sumEven);
    }
}

// answer should be 4613732
