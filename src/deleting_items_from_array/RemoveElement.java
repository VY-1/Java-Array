package deleting_items_from_array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int k = removeElement(nums, val);

    }

    public static int removeElement(int[] nums, int val){
        int numElement = 0;
        int size = nums.length;
        for(int i = 0; i < size; i++){
            if(nums[i] != val){
                nums[numElement] = nums[i];
                numElement++;

            }

        }

        for(int i = 0; i < numElement; i++){
            System.out.println("index " + i + " value " + nums[i] + " ");
        }
        return numElement;
    }
}
