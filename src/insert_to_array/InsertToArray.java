package insert_to_array;

public class InsertToArray {
    public static void main(String[] args){
        //Declare an integer array of 6 elements
        int[] intArray = new int[10];
        // keep track of array length
        int length = 0;

        //Add 3 elements to the array
        for(int i = 0; i < 3; i++){
            intArray[length] = i;
            length++;
        }

        //Run printArray function
        printArray(intArray);

        System.out.println("=====================");

        //Insert a new element at the end of the array
        intArray[length] = 10;
        length++;

        printArray(intArray);

        System.out.println("=====================");

        //Insert at the Start of Array; Time complexity O(N), where N is the length of the array
        //Shifting array to the right, one by one
        for(int i = length; i >=0; i--){
            //Shift to the right by 1
            intArray[i + 1] = intArray[i];
        }
        //Insert the new element at the start of the array, at index0
        intArray[0] = 20;
        length++;

        printArray(intArray);

        System.out.println("=====================");

        //Inserting element at any index
        intArray = insertToArray(intArray, 15, 2, length);
        length++;
        printArray(intArray);
    }

    public static void printArray(int[] intArray){
        for(int i = 0; i < intArray.length; i++){
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }

    //Method to insert Array at any index, will return the new array
    public static int[] insertToArray(int[] intArray, int value, int indexToInsert, int lastIndexLength){
        for(int i = lastIndexLength; i >=  indexToInsert; i--){
            intArray[i+1] = intArray[i];
        }
        intArray[indexToInsert] = value;
        return intArray;
    }


}
