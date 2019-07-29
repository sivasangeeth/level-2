import java.util.Arrays;
import java.util.Scanner;
import java.util.Iterator;
public class repee {
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
		String s = sc.next();
		n = s.length();
		String p ="";String t =""; 
		char c [] = s.toCharArray();
		for(int i=0;i<n;i++){
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || 
					c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U'){
				t = t + c[i];
							}
			else{
			p = p + c[i];
			}
		}
		StringBuffer st = new StringBuffer(p);
		System.out.println(st.reverse());
		}
		}
