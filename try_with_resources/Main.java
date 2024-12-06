package try_with_resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException
    {

        int i = 2;
        int j = 0;

        int num = 0;

        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {

            num = Integer.parseInt(br.readLine());

            System.out.println(num);
            
        }
    }
}
