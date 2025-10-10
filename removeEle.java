public class removeEle {
    public static void main(String[] args){
        int[] arr = {3, 3, 4, 4, 6, 4};
        System.out.println(RemoveEle(arr, 4));
    }
    
    static int RemoveEle(int[] nums, int val){
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
