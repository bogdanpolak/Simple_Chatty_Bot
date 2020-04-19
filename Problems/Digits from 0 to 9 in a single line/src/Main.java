import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(21, 13, 8, 5, 3, 2, 1, 1, 0));
        numbers.forEach(
                v -> System.out.print(v.toString()+" "));
    }
}