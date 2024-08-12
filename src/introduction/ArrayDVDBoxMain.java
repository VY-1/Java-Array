package introduction;

import java.util.Arrays;

public class ArrayDVDBoxMain {
    public static void main(String[] args) {

        //Create an array of dvdCollection to store DVD
        DVD[] dvdCollection = new DVD[15];

        //Create a DVD object
        DVD avengersDVD = new DVD("The Avengers", 2012,"Joss Whedon");

        //Put it in the 8th place of the array.
        dvdCollection[7] = avengersDVD;

        //Put a few more DVD's in the array
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        // Put "The Incredibles" into the 4th place: index 3.
        dvdCollection[3] = incrediblesDVD;

        // Put "Finding Dory" into the 10th place: index 9.
        dvdCollection[9] = findingDoryDVD;

        // Put "The Lion King" into the 3rd place: index 2.
        dvdCollection[2] = lionKingDVD;

        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
        dvdCollection[3] = starWarsDVD;

        // Print out what's in indexes 7, 10, and 3.
        System.out.println(dvdCollection[7]);
        System.out.println(dvdCollection[10]);
        System.out.println(dvdCollection[3]);


    }


}
