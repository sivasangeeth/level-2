import java.util.*;
class swapi{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                s1=String.valueOf(s.charAt(i));
                System.out.print(s.charAt(i+1));
                System.out.print(s.charAt(i));
            }
        }
       
    }
}
