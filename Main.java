import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];
        int K, i;
        int n = 0; // elementu skaits masīvā C

        System.out.println("261EJB023 Marks Baufals");
        System.out.println("14. variants");

        Scanner sc = new Scanner(System.in);
        System.out.print("K=");
        K = sc.nextInt();
        sc.close();

        // 1. Masīvu A un B aizpildīšana
        if (K == 0) {
            Random r = new Random();
            for (i = 0; i < 10; i++) {
                A[i] = r.nextInt(21) - 10;   // [-10; 10]
                B[i] = r.nextInt(101) - 50;  // [-50; 50]
            }
        } else {
            for (i = 0; i < 10; i++) {
                int sign = (i % 2 == 0) ? 1 : -1; // (-1)^i
                A[i] = sign * (i - K);
                B[i] = sign * (i - 5) * K;
            }
        }

        // 2. Masīvu A un B izvade (katrs vienā rindā)
        System.out.println("A:");
        for (i = 0; i < 10; i++) {
            System.out.print(A[i] + "\t");
        }
        System.out.println();

        System.out.println("B:");
        for (i = 0; i < 10; i++) {
            System.out.print(B[i] + "\t");
        }
        System.out.println();

        // 3. Masīva C izveide
        // negatīvie no A
        for (i = 0; i < 10; i++)
            if (A[i] < 0) C[n++] = A[i];
        // negatīvie no B
        for (i = 0; i < 10; i++)
            if (B[i] < 0) C[n++] = B[i];
        // nulles no A
        for (i = 0; i < 10; i++)
            if (A[i] == 0) C[n++] = A[i];
        // nulles no B
        for (i = 0; i < 10; i++)
            if (B[i] == 0) C[n++] = B[i];
        // pozitīvie no A
        for (i = 0; i < 10; i++)
            if (A[i] > 0) C[n++] = A[i];
        // pozitīvie no B
        for (i = 0; i < 10; i++)
            if (B[i] > 0) C[n++] = B[i];

        // 4. Masīva C izvade, 10 elementi katrā rindā
        System.out.println("C:");
        for (i = 0; i < n; i++) {
            System.out.print(C[i] + "\t");
            if ((i + 1) % 10 == 0) System.out.println();
        }
    }
}
