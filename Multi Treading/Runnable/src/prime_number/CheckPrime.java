package prime_number;

public class CheckPrime {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Prime numbers:");
            for (int n = 2; n <= 100; n++) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(n);
                }
            }
        });
        t.start();
    }
}
