package OOPs.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Alice","Bob","Charlie");


        //using lambda to iterate
        names.forEach(name-> System.out.println(name));
    }
}
