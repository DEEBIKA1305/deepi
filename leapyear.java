package dp;
import java.util.*;
public class leapyear {
public static void main(String args[]){
	int yr;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any year:");
	yr=s.nextInt();
	if(yr%4==0){
		System.out.println("It is a leap year");
	}
	else{
		System.out.println("It is not a leap year ");
	}
}
}
