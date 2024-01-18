public class ArrayFlipper {

    public Integer[] flip1(Integer[] arr) {
        Integer[] out = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = arr[i] ^ 1;
        }
        return out;
    }

    public Integer[] flip2(Integer[] arr) {
        Integer[] out = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = Math.abs(arr[i] - 1);
        }
        return out;
    }

    public Integer[] flip3(Integer[] arr) {
        Integer[] out = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = (arr[i] + 1) % 2;
        }
        return out;
    }

}
