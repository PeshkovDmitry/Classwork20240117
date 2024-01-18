/**
 * Класс, реализующий шифратор по "шифру Цезаря"
 */

public class CaesarСoder {

    public String code(String text, Integer offset, boolean decode) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (decode) {
                chars[i] -= offset;
            } else {
                chars[i] += offset;
            }
        }
        return new StringBuilder().append(chars).toString();
    }
}
