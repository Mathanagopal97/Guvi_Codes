import java.util.*;
 
public class RoToNum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = 0;
        char r;
 
        for (int i=0; i<str.length(); i++)
        {
            int s1 = 0;
            r = str.charAt(i);
            if (r == 'I')
                  s1 = 1;
            if (r == 'V')
                s1 = 5;
            if (r == 'X')
                s1 = 10;
            if (r == 'L')
                s1 = 50;
            if (r == 'C')
                s1 = 100;
            if (r == 'D')
                s1 = 500;
            if (r == 'M')
                s1 = 1000;

            if (i+1 <str.length())
            {
                r=str.charAt(i+1);
                int s2 =0;
                if (r == 'I')
                  s2 = 1;
                if (r == 'V')
                  s2 = 5;
                if (r == 'X')
                  s2 = 10;
                if (r == 'L')
                  s2 = 50;
                if (r == 'C')
                  s2 = 100;
                if (r == 'D')
                  s2 = 500;
                if (r == 'M')
                  s2 = 1000;

                if (s1 >= s2)
                {
                    res = res + s1;
                }
                else
                {
                    res = res + s2 - s1;
                    i++;
                }
            }
            else
            {
                res = res + s1;
                i++;
            }
        }
System.out.println(res);
    }
}
