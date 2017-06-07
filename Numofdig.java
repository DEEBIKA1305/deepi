package dp;
import java.util.*;
public class Numofdig {
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
     int num,count=0;
     System.out.println("Enter any multi digit number:");
     num=s.nextInt();
     while(num>0){
    	 int n=num%10;
    	 count++;
    	 num=num/10;
    	}
     System.out.println(count);
	}}

