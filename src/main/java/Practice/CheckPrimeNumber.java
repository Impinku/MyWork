package Practice;

public class CheckPrimeNumber {
    static int i = 2;
    static boolean primeNum(int n) {

        if (n == 0 || n == 1) {
            return false;
        }
        if (n == i) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        i++;
        return primeNum(n);
    }

    public static void main(String[] args) {
        if (primeNum(13)) {
            System.out.println("Number is prime :");
        } else {
            System.out.println("Number is not prime :");
        }
    }
}
