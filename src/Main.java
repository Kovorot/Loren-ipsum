import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
            "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco " +
            "laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " +
            "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa " +
            "qui officia deserunt mollit anim id est laborum.";
    public static void main(String[] args) {
        Map<Character, Integer> symbols = new HashMap<>();
        int length = text.length();
        int number = 0;
        while(number < length) {
            if (symbols.containsKey(text.charAt(number))) {
                symbols.put(text.charAt(number), symbols.get(text.charAt(number)) + 1);
            } else {
                symbols.put(text.charAt(number), 1);
            }
            number++;
        }

        int maxValue = 0;
        int minValue = text.length();

        for (Map.Entry<Character, Integer> kv : symbols.entrySet()) {
            if (kv.getValue() > maxValue) {
                maxValue = kv.getValue();
            } else if (kv.getValue() < minValue) {
                minValue = kv.getValue();
            }
        }

        System.out.println("Максимальное значение: " + maxValue);
        System.out.println("Минимальное значение: " + minValue);
    }
}