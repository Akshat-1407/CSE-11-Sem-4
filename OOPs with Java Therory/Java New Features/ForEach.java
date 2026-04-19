import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> names = List.of("Amit", "Sneha", "Rahul");
        System.out.println("");

        // With Collection and Lambda Expression
        names.forEach(name -> System.out.println(name));
        System.out.println("");

        // With Collection and Method Reference
        names.forEach(System.out::println);
        System.out.println("");

        // With Streams and Lambda Expression & Method Reference
        names.stream()
                .filter(n -> n.startsWith("A"))
                .forEach(System.out::println);
    }
}
