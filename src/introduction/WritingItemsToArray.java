package introduction;

public class WritingItemsToArray {

    public static void main(String[] args) {
        int[] squareNumber = new int[10];

        for(int i=0; i< 10; i++){
            int square = (i + 1) * (i + 1);
            squareNumber[i] = square;
        }

        for (int square: squareNumber){
            System.out.println(square);
        }


    }

}
