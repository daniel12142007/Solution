import java.util.Scanner;

public class Solutions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int trener = scanner.nextInt();
        int azamats = scanner.nextInt();
        int az = azamats;
        int azamat_minuta = scanner.nextInt();
        int nurbeks = scanner.nextInt();
        int nu = nurbeks;
        int nurbek_minuta = scanner.nextInt();
        azamat(az, azamat_minuta, trener, nurbek_minuta, nu);

    }

    public static void azamat(int az, int min, int trener, int minN, int nu) {
        for (int i = 0; i < trener; i++) {
            int a = az * min;
            int n = nu * minN;
            if (a < n) {
                az++;
            }
            if (a > n) {
                nu++;
            }
            if (az == trener) {
                int trener2 = trener;
                System.out.println(aVoid(trener2, az, nu));
            }
            if (nu == trener) {
                int trener1 = trener;
                System.out.println(nVoid(trener1, az, nu));
            }
            if (a == n) {
                System.out.println(az);
                System.out.println(nu);
                break;
            }
        }
    }

    public static int aVoid(int trener, int az, int nu) {
        if (az == trener) {
            return nSave(trener, nu);
        }
        return 0;
    }

    public static int nSave(int trener, int nu) {
        while (true) {
            if (nu == trener) {
                return nu;
            }
        }
    }

    public static int nVoid(int trener, int az, int nu) {
        if (nu == trener) {
            return aSave(trener, az);
        }
        return 0;
    }

    public static int aSave(int trener, int az) {
        while (true) {
            if (az == trener) {
                return az;
            }
        }
    }
}