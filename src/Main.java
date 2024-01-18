import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String decodedString = new CaesarСoder().code("Привет, мир!", 5, true);
        System.out.println(decodedString);
        String encodedString = new CaesarСoder().code(decodedString, 5, false);
        System.out.println(encodedString);

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(
                new ArrayOffseter().offset(arr, 5)
        ));

        Integer[] arr1 = {1, 0, 0, 1, 0, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(
                new ArrayFlipper().flip1(arr1)
        ));
        System.out.println(Arrays.toString(
                new ArrayFlipper().flip2(arr1)
        ));

        System.out.println(Arrays.toString(
                new ArrayFlipper().flip3(arr1)
        ));


    }
}