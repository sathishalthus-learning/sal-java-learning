package learning.dev._15_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class a_Collection {
    public static void main(String[] args) {
        //
        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        System.out.println("strings = " + strings);
        strings.remove("one");
        System.out.println("contains one = " + strings.contains("one"));
        System.out.println("strings = " + strings);

        Collection<String> first = new ArrayList<>();
        first.add("four");
        first.add("five");
        strings.addAll(first);
        System.out.println("strings = " + strings);

        Collection<String> middle = new ArrayList<>();
        middle.add("four");
        middle.add("five");
        strings.removeAll(middle);
        System.out.println("removed = " + strings);

        Collection<String> last = new ArrayList<>();
        last.add("four");
        last.add("two");
        strings.retainAll(last);
        System.out.println("retained = " + strings);
        System.out.println("size = " + strings.size());
        System.out.println("isempty = " + strings.isEmpty());

        Object[] s1 = strings.toArray();
        System.out.println("objects" + Arrays.toString(s1));

        String[] s2 = strings.toArray(new String[] {});
        System.out.println("s2" + Arrays.toString(s2));

        String[] s3 = strings.toArray(String[]::new);
        System.out.println("s3" + Arrays.toString(s3));

        // filteing using predicate

        // choosing implementation

        // iterating
        Collection<String> loopCollection = List.of("one", "two", "three");
        // 1. for-each
        for (String element : loopCollection) {
            System.out.println(element);
        }
        // 2.iterator
        for (Iterator<String> iterator = loopCollection.iterator(); iterator.hasNext();) {
            String element = iterator.next();
            if (element.length() == 3) {
                System.out.println(element);
            }
        }
        // 3.while
        Iterator<String> iterator = loopCollection.iterator();
        while (iterator.hasNext()) {

            String element = iterator.next();
            strings.remove(element);
        }
    }
}
