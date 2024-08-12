package searching_items_in_array;

public class SearchItemsInArray {
    public static void main(String[] args) {

        // Declare a new array of 6 elements
        int[] array = new int[6];

        // Variable to keep track of the length of the array
        int length = 0;

        // Iterate through the 6 indexes of the array
        for(int i = 0; i < 6; i++){
            // Add a new element and increase the length as well
            array[length++] = i;
        }

        // Print out the results of searching for 4 and 30.
        System.out.println("Does the array contain the element 4? - "+
                linearSearch(array, length, 4));    //true
        System.out.println("Does the array contain the element 30? - "+
                linearSearch(array, length, 30));   //false



    }

    //O(n) for linear search
    public static boolean linearSearch(int[] array, int length, int element){
        //Check for edge cases. Is the array null or empty?
        //if it is, then return false, because searching is not possible
        if(array == null || length == 0){
            return false;
        }

        //Carry out the linear search by checking each element
        for(int i = 0; i < length; i++){
            //If array found at index, return true
            if(array[i] == element){
                return true;
            }
        }
        //at the end of the array, if nothing found, return false
        return false;
    }
}
