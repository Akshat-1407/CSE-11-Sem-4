import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamApi {
    public static void main(String[] args) {
        List<String> names = List.of("Akshar", "Sumedha", "Ankit", "Priyanshi");
        Stream<String> nameStream = names.stream();

        List<String> result = nameStream.filter(name -> name.startsWith("A"))
                  .map(String::toUpperCase)  // .map(name -> name.toUpperCase())
                  .collect(Collectors.toList());
        
        System.out.println(result);

    }
}
