import java.util.Scanner; 
 
 public class numprim1{ 
    public static void main(String args[]){ 
       int number,nn=0; 
       Scanner sc = new Scanner(System.in); 
       //System.out.println("Enter a number ::"); 
       number = sc.nextInt(); 
        
       for(int i = 2; i< number; i++) { 
          while(number%i == 0) { 
             System.out.println(i+" "); 
             number = number/i; 
             if(number==i)
             number=-1;
          } 
       } 
       //int 
       if(number >2) { 
            
          System.out.println(number); 
          nn=number; 
       } 
    } 
 } 
 

