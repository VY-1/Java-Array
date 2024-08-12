package introduction;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] sortedArray = sortedSquares(nums);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = nums[i]*nums[i];
        }
        Arrays.sort(result);
        return result;

    }
}
