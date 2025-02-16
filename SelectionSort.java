public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = { 12, 5, 1, 6, 8, 7 };
        int minIndex;
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

        }

        for (int i : nums) {
            System.out.print(" " + i);
        }
    }
}