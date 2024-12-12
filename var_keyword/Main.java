package var_keyword;

public class Main {

    public static void main(String[] args)
    {
        int a = 10;
        var b = 20;

        int nums1[] = {10,20,30,40,50};

        for(int n : nums1)
        {
            System.out.println(n);
        }

        var nums2 = new int[4];
        nums2[0] = 100;
        nums2[1] = 200;
        nums2[2] = 300;
        nums2[3] = 400;

        for(int nm : nums2)
        {
            System.out.println(nm);
        }



        // System.out.println(a);
        // System.out.println(b);
    }
}
