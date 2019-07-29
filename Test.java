import java.util.*;
class Test
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String s1=sc.nextLine();
             String s2="";
            int c=0;
            if(s.length()==s1.length())
            {
            for(int i=0;i<s.length();i++)
            {
                    if(s.charAt(i)==s1.charAt(i))
                    s2+=s.charAt(i);
                    else
                    c++;
                
            }
            }
                if(c==1 && s2!="")
                {
                  System.out.print("yes");
                }
                else
                System.out.print("no");
            }
        }
