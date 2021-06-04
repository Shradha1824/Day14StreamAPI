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

	List<String> stringlist = Arrays.asList("Aahan", "Shashi",
		"preeti", "Ganesh", "Kundan", "Suresh");

	// creating stream of strings
        Stream<String> s = Stream.of("Ram","Sunil",
	        "Gajanan","Diksha","Govind","Avinash", "Ahana");
	  	
  
        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the
        // elements ending with s
        stream.filter(str -> str.startsWith("S"))
            .forEach(System.out::println);
   
	stream.filter(str -> str.length() > 3)
            .forEach(System.out::println);
     
	//stringlist.stream().sorted().forEach(System.out::println);     
	List<String> sortedList = stringlist.stream().sorted().collect(Collectors.toList());  
	    sortedList.forEach(System.out::println);
	    
	// counting number of strings in stream
        long count_string =  s.collect(Collectors.counting());
      	    System.out.println(count_string);
     }
}
