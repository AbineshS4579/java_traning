import java.util.*;

public class Main {

    static long turns(long[] a) {
        long result = 0;

        for (int i = 0; i < a.length - 1; i++) {
            result += Math.max(0, a[i] - a[i + 1] - 1);
            result++;
        }

        result += a[a.length - 1];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[m];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            for (int i = 0; i < m; i++)
                b[i] = sc.nextLong();

            long A = turns(a);
            long B = turns(b);

            // Bea moves first.
            if (A <= B)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}