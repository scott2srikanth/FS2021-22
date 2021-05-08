package kmit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.asList;

public class A {
    static public  void main(String... args) {
        String[] arr ={"Ram","Mohan","Bob"};
        List<String> l = new ArrayList<>(asList(arr));
        l.removeIf(x -> x.charAt(0)=='M');
        l.forEach(v -> System.out.println(v));
    }
}
