package array_set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args)
    {
        Set<Integer> nums = new HashSet<>();

        nums.add(62);
        nums.add(58);
        nums.add(82);
        nums.add(22);
        nums.add(65);

        for(int n : nums)
        {
            System.out.println(n);
        }

        System.out.println("====================");

        Set<Integer> nums1 = new TreeSet<>();

        nums1.add(62);
        nums1.add(58);
        nums1.add(82);
        nums1.add(22);
        nums1.add(65);

        for(int n : nums1)
        {
            System.out.println(n);
        }

        System.out.println("====================");

        Collection<Integer> nums2 = new TreeSet<>();

        nums2.add(62);
        nums2.add(58);
        nums2.add(82);
        nums2.add(22);
        nums2.add(65);

        Iterator<Integer> values = nums2.iterator();

        while(values.hasNext())
        {
            System.out.println(values.next());
        }

        
    }
}
