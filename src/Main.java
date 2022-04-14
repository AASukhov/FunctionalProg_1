import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String text = "Native speakers want to talk with u";
        Function<String, List<String>> function = (a) -> Arrays.stream(a.split(" ")).sorted().distinct().toList();
        function.apply(text).forEach(System.out::println);

        // Использование Function и монады .stream
    }
}
