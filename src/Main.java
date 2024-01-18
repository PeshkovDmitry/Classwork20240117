import Task1.CaesarСoder;

public class Main {
    public static void main(String[] args) {
        String decodedString = new CaesarСoder().code("Привет, мир!", 5, true);
        System.out.println(decodedString);
        String encodedString = new CaesarСoder().code(decodedString, 5, false);
        System.out.println(encodedString);
    }
}