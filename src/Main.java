import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] _args) {
      int[] arr={5,4,20};
      String[] names={"Ram","Mohan"};
      ArrayList<String> l=new ArrayList(Arrays.asList(names));
      l.forEach(a->System.out.println(a));
      l.removeIf(s->s.charAt(0) !='M');
      l.forEach(a->System.out.println(a));
    }
}





