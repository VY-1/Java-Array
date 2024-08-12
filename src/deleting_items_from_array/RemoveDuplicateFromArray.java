package deleting_items_from_array;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int k = removeDuplicates(nums);
        System.out.println(k);

    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i+1];
            }

        }

        for(int i = 0; i < index; i++) {
            System.out.println("Index: " + i + ", Value: " + nums[i]);
        }
        return index;
    }
}
