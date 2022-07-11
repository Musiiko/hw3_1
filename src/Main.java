public class Main {
    public static void main(String[] args) {
        int[] arrayN = {0, 2, 4, 6, 3, -1, 1};
        int[] arrayK = {4, 6, 3};
        boolean isSubsequence = false;

        for (int i = 0; i < arrayN.length; i++) {
            for (int j = 0; j < arrayK.length; j++) {
                if ((i + j) >= arrayN.length) {
                    break;
                }
                if (arrayN[i + j] == arrayK[j]) {
                    isSubsequence = true;
                } else {
                    isSubsequence = false;
                    break;
                }
            }
            if (isSubsequence) {
                System.out.println("The second sequence K is included in the first N.");
                break;
            }
        }
        if (!isSubsequence) {
            System.out.println("The second sequence K is not included in the first N.");
        }
    }
}
