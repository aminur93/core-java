package for_each_method;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        //Consumer<Integer> con = n -> System.out.println(n);
        
        nums.forEach(n -> System.out.println(n));
    }
}
