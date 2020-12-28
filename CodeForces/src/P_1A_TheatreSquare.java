import java.util.Scanner;

public class P_1A_TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, m, a, x, y;
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();

        if (n % a == 0) {
            x = n / a;
        } else {
            x = n / a + 1;
        }
        if (m % a == 0) {
            y = m / a;
        } else {
            y = m / a + 1;
        }
        System.out.println(Long.toUnsignedString(x * y));
    }
}
