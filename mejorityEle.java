public class mejorityEle {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int majorityElement = findMajorityElement(arr);
        System.out.println("Majority Element: " + majorityElement);
    }

    static int findMajorityElement(int[] nums) {
        int count = 0;

        // Variable to store the current candidate for majority element
        Integer valStore = null;

        for (int num : nums) {
            if (count == 0) {
                valStore = num;
            }
            // Increment or decrement the count based on the current number
            count += (num == valStore) ? 1 : -1;
        }

        return valStore;
    }
}