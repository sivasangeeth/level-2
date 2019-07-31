import java.util.*;
class strrept{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count1=0,count=0;
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            count=0;
           char s1=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                if(s1==s.charAt(j))
                count+=1;
            }
        
        if(count1<count)
        {
            count1=count;
            s2=s2+(String.valueOf(s1));
        }
        }
    
  //  System.out.print(count1);
      System.out.print(s2.charAt(s2.length()-1));
    }
}
