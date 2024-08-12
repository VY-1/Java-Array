package introduction;

public class FindNumbersWithEvenNumberOfDigtis {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int eventDigit = findNumbers(nums);
        System.out.println(eventDigit);
    }

    public static int findNumbers(int[] nums) {
        //store the total of even digit number found
        int evenDigit = 0;

        //Go through each number to check for even digit
        for(int num: nums){
            //counter to store how many digits for each number
            int count = 0;
            while(num !=0){
                num /=10;
                count++;
            }

            //if the count of the current number is even, increase the evenDigit count
            if(count % 2 == 0){
                evenDigit++;
            }

        }
        //return the total evenDigit found
        return evenDigit;
    }
}
