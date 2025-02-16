
import java.util.Arrays;

public class GeneralCode {
    public static void main(String[] args) {
        int[] nums = { 2, -1, 3, 4, 7, 56, 45, 34, 22 };
        int target = 2;
        String resultLinearSearch = (linearSearch(nums, target) != null) ? "Element found" : "Element Not Found";
        String resultBinarySearch = (binarySearch(nums, target) != null) ? "Element found" : "Element Not Found";
        System.out.println(resultBinarySearch);
    }

    // linear serach for index number
    public static Object linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("found at index : " + i);
                return 1;
            }
        }
        return -1;
    }

    public static Object binarySearch(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("found at index: " + mid);
                return 1;
            } else if (nums[mid] < 7) {
                left = mid + 1;
            } else {
                right = mid + 1;
            }

        }
        return -1;
    }
}
