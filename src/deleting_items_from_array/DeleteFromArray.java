package deleting_items_from_array;

public class DeleteFromArray {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        //The array currently contains 0 elements
        int length = 0;

        //Add elements at the first 6 indexes of the array
        for(int i = 0; i < 6; i++){
            intArray[i] = i;
            length++;
        }

        printArray(intArray, length);

        System.out.println("========================");

        //delete the last index of the array
        length--;
        printArray(intArray, length);

        System.out.println("========================");

        //Delete from the start of an array
        deleteFromArray(intArray, 0);
        length--;

        printArray(intArray, length);

        System.out.println("========================");

        //Delete from index 2
        deleteFromArray(intArray, 2);
        length--;
        printArray(intArray, length);


    }

    public static void printArray(int[] intArray, int length){
        for(int i = 0; i < length; i++){
            System.out.println("Index " + i + " contains " + intArray[i]);

        }
    }

    public static void deleteFromArray(int[] intArray, int index){
        for(int i = index; i<intArray.length-1; i++){
            //Shift to the left by one
            intArray[i] = intArray[i+1];
        }
    }


}
