import java.util.*;
import java.math.*;
class srromtoint{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='I')
            a+=1;
            else if(c=='X')
            a+=10;
            else
            a+=5;
        }
        System.out.print(a);
    }
}

