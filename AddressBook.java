import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class AddressBook {
	public static void main(String[] args)
    {
  
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Anusha", "Vaishnavi",
        "Shakti", "Geet","Ravi");
  
        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the
        // elements ending with s
        stream.filter(str -> str.startsWith("S"))
            .forEach(System.out::println);
    
    }
}
