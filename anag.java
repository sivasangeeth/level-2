import java.util.*;
class anag{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        String ss="kabali";
        char a[]=ss.toCharArray();
        Arrays.sort(a);
        String str=Arrays.toString(a);
        int count=1;
        for(int i=0;i<s.length;i++)
        {
            s[i]=sc.nextLine();
        }
        String p="";
        for(int i=0;i<s.length;i++)
        {
            p="";
            p=s[i];
            char b[]=p.toCharArray();
            Arrays.sort(b);
            String str1=Arrays.toString(b);
            if(str.equalsIgnoreCase(str1))
            count=count+1;
        }
        System.out.print(count);
    }
}
