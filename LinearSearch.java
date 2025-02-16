public class LinearSearch {

    public static void main(String[] args) {
        int[] a = { 2, -1, 3, 4, 7, 56, 45, 34, 22 };

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 45) {
                System.out.println("found value: " + a[i]);
                return;
            }
        }

    }
}
