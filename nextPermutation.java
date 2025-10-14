public class nextPermutation{
    public static void main(String[] args){
        int[] nums = {1,2,3};
        nextPermutation(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    static void nextPermutation(int[] nums){
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        if(i >= 0){
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j]; 
        nums[j] = temp;
    }
    static void reverse(int[] nums, int start){
        int i = start, j = nums.length - 1;
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}