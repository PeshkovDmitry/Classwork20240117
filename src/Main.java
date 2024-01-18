import Task1.CaesarСoder;
import Task2.ArrayOffseter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String decodedString = new CaesarСoder().code("Привет, мир!", 5, true);
        System.out.println(decodedString);
        String encodedString = new CaesarСoder().code(decodedString, 5, false);
        System.out.println(encodedString);

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(
                new ArrayOffseter().offset(arr, 5)
        ));



    }
}