package searching_items_in_array;

public class ValidMountainArray {
    public static void main(String[] args) {

        int[] arr = {0,3,2,1};
        System.out.println(validMountainArray(arr));

    }

    public static boolean validMountainArray(int[] arr) {
        //Edge cases
        if(arr == null || arr.length < 3){
            return false;
        }
        if(arr[0] > arr[1]){
            return false;
        }
        boolean increasing = true;

        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i] == arr[i+1]){
                return false;
            }
            if(increasing && arr[i] < arr[i+1]){
                continue;
            }
            if(increasing && arr[i] > arr[i+1]){
                increasing = false;
            }
            if(!increasing && arr[i] > arr[i+1]){
                continue;
            }
            if(!increasing && arr[i] < arr[i+1]){
                return false;
            }


        }
        return !increasing;


    }
}
