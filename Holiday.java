import java.util.*;
class Holiday
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String s1="Saturday";
             String s2="Sunday";
           if(s.equalsIgnoreCase(s1) || s.equalsIgnoreCase(s2)) 
                  System.out.print("yes");
           else
                System.out.print("no");
         }
    }
