package learning.dev._2_language;

import java.util.List;

public class a_VarType {
    public static void main(String[] args) {
        // 
        var list = List.of("one", "two", "three", "four");
for (var element: list) {
    System.out.println(element);
}

    }
}
