import java.util.Scanner;

public class P_71A_WayTooLongWords {
    public static void main(String[] args) {
        String input;
        double n;
        char first, last;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (double i = 0; i <= n; i++) {

            input = sc.nextLine();

            if (input.length() > 10) {

                first = input.charAt(0);
                last = input.charAt(input.length() - 1);
                System.out.println(first + String.valueOf(input.length() - 2) + last);

            } else {
                System.out.println(input);
            }
        }
    }
}
