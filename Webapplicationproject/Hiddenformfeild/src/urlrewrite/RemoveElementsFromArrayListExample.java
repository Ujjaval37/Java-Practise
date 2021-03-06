package urlrewrite;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javafx.scene.input.PickResult;
public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        List<String> output = programmingLanguages.stream()
        		.filter(f->f.startsWith("Ja")).map(String::toUpperCase).
        		collect(Collectors.toList());
        System.out.println(output);
        
        //System.out.println("Initial List: " + programmingLanguages);
        //System.out.println("Programming languages are \n" + programmingLanguages);
       
        
                
       

   }
}