import java.util.*;
import java.math.*;
class srrev{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String s1=String.valueOf(sb);
        System.out.print(s1);
    }
}

