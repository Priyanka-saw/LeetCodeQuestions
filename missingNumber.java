public class missingNumber {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        int n = nums.length;
        
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ nums[i];

            // xor of 1 to n
            xor1 = xor1 ^ (i + 1);
        }
        // giving  all missing numbers
        return xor1 ^ xor2;
    }
}


// complexity O(n) and space O(1)