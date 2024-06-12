
    import javax.xml.stream.events.Characters;
    import java.util.Arrays;
import java.util.LinkedHashMap;
    import java.util.Map;
    import java.util.Optional;
    import java.util.function.Function;
import java.util.stream.Collectors;

//    import static java8.Java8_Demo.str;

    public class main {
        public static void main(String [] args) {

//            String str ="Java Articles are Awesome";
            // find first not repeating character from the given string
            String input = "Java articles are Awesome";
            findFirstNonRepeatingCharacter(input);
        }
            public static void findFirstNonRepeatingCharacter(String input){
                Optional<Character> firstrepeatedchar = input.chars().mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).entrySet()
                        .stream().filter(entry -> entry.getValue()==1).map(Map.Entry::getKey).findFirst();
                if (firstrepeatedchar.isPresent()) {
                    System.out.println("nonRepeatingChar : " + firstrepeatedchar.get());
                }
        }
        }


