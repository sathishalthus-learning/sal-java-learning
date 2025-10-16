package learning.playground;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionAndIterator {
    public static void main(String[] args) {
        // trying for loop using iterator and collection
        Collection<String> strings = List.of("one", "two", "three", "four");
        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext();) {
            String element = iterator.next();
            if (element.length() == 3) {
                System.out.println(element);
            }
        }

        // using while
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() == 3) {
                System.out.println(element);
            }
        }

    }
}
