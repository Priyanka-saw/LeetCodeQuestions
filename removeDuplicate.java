import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 4, 4 };
        System.out.println(Duplicate(arr));
        // System.out.println(Arrays.toString(arr));
    }

    static int Duplicate(int[] nums) {
        // int n = nums.length;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return (i + 1);
    }
}
