public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = { 3, 6, 7, 1, 2, 4, 5 };

        int temp;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Sorted Array");
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }
}
