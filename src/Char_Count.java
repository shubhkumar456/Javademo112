import java.util.Map;
import java.util.stream.Collectors;

public class Char_Count {
    public static void main(String[] args) {
        String input = "aaabbbbccd";
        String output = countCharacters(input);
        System.out.println(output);
    }
    public static String countCharacters(String input){
        return input.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(c-> c, Collectors.counting()))
                .entrySet().stream().map(entry -> entry.getKey()
                        .toString()+entry.getValue()).collect(Collectors.joining());
//        Map<Character, Long> chr = input.chars().mapToObj(c ->(char)c)
//                .collect(Collectors.groupingBy(c-> c, Collectors.counting()));
//        StringBuilder result = new StringBuilder();
//        chr.forEach((key, value) -> result.append(key).append(value));
//
//        return result.toString();
    }
}
