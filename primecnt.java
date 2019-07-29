import java.util.*;
class primecnt{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int Count=0;
        for(int i=n;i<n1;i++)
        {
            if(i%2==0)
            Count++;
         }
            System.out.print(Count);
    }
}

