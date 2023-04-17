import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int smog = scanner.nextInt();
        int[] mother = new int[day];
        int p = 0;
        for (int i = 0; i < day; i++) {
            mother[i] += scanner.nextInt();
        }
        int[] a = new int[11];
        for (int i = 1; i < mother.length; i++) {
            for (int j = 0; j < mother.length; j++) {
                if (j != i) {
                    if (mother[j] == mother[i]) {
                        if (smog <= mother[j]) {
                            a[j] = mother[j];
                            p++;
                        }
                    }
                }
            }
        }
        System.out.println(a[1]);
    }
}
//[0, 5, 6, 7, 6, 0, 2, 8, 7, 5, 3]
//2 5 6 7 6 0 2 8 7 5 3