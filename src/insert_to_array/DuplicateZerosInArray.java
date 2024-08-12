package insert_to_array;

public class DuplicateZerosInArray {
    public static void main(String[] args) {

        int[] arr = {1,0,2,3,0,4,5,0};

        duplicateZeros(arr);

    }

    public static void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                for(int j = arr.length-2; j >= i; j--){
                    arr[j+1] = arr[j];
                }
                if((i+1) < arr.length){
                    arr[i+1] = 0;
                }
                i++;    //need to increment i to skip the newly added 0 value

            }
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void duplicateZeros2(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                for(int j = arr.length-2; j >= i; j--){
                    arr[j+1] = arr[j];
                }
                if((i+1) < arr.length){
                    arr[i+1] = 0;
                }
                i++;    //need to increment i to skip the newly added 0 value

            }
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
