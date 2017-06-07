package dp;
import java.util.*;
public class Naturalsum {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int sum=0;
	    System.out.println("Enter the number of integers to be added:");
		int num=s.nextInt();
		for(int i=1;i<=num;i++){
			 sum=sum+i;
		}
		System.out.println("Sumof the natural numbers are:"+sum);
	}

}
