import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        numbers.forEach(
                v -> System.out.print(v.toString()+" "));
            

    }
}