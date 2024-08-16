package implementing_array;

import java.util.Arrays;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        myArray.push("Hello");
        myArray.push("World");
        myArray.push("Java");
        myArray.push("Leet");
        myArray.push("Array");
        myArray.push("Apple");
        myArray.push(12);


        for(int i =0; i < myArray.length; i++){
            System.out.println(myArray.get(i));
        }

        System.out.println("==================");
        System.out.println("Pop item: " + myArray.pop());
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray.get(i));
        }
        System.out.println("==================");
        System.out.println("Deleted Item: " + myArray.delete(2));

        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray.get(i));
        }
    }
}
