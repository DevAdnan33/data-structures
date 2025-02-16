
import java.util.Arrays;

public class BinarySerach {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] a = { 2, -1, 3, 4, 7, 56, 45, 34, 22 };
        Arrays.sort(a);

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] == 7) {
                System.out.println("found value : " + a[mid]);
                return;
            } else if (a[mid] < 7) {
                left = mid + 1;
            } else {
                right = mid +  1;
            }

        }
        long endTime = System.nanoTime();
        long totalTime = startTime - endTime;
        System.out.println("Executiong time: " + totalTime);
    }

}
