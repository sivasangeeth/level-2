import java.util.*;
class addchar{
    public static void main(String arfs[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s2="";
       // char a[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            int n=((int)(s.charAt(i)))+3;
            if(n>122)
             System.out.print((char)(n+96-122));
            else
             System.out.print((char)n);
        }
    }
}
