import java.util.*;
class spi{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        String s1="",s3="";
        for(int i=0;i<s.length;i++)
        {
            
         s1=s[i].substring(0,1).toUpperCase()+s[i].substring(1).toLowerCase();

     System.out.print(s1+" ");
        }
       
    }
}
