package introduction;

public class FindMaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);

        System.out.println(maxConsecutiveOnes);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 1){
                count ++;
                if(count > maxConsecutiveOnes){
                    maxConsecutiveOnes = count;
                }
            }else{
                count = 0;
            }


        }
        return maxConsecutiveOnes;
    }
}
