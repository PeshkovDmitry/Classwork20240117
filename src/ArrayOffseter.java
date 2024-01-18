import java.util.Arrays;

public class ArrayOffseter {

    public Integer[] offset(Integer[] arr, Integer offset) {
        Integer[] tail = Arrays.copyOfRange(arr,arr.length - offset,arr.length);
        Integer[] newArr = Arrays.copyOf(tail,arr.length);
        for (int i = 0; i < arr.length - offset; i++) {
            newArr[i + offset] = arr[i];
        }
        return newArr;
    }



}
