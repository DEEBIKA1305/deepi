package dp;
import java.util.*;
public class alpha {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Press any key");
	char ch=s.next().charAt(0);
	if((ch>="a"&&ch<="z")||(ch>="A"&&ch<="Z")){
		System.out.println("It is an alphabet");
	}
	else{
		System.out.println("It is not an alphabet");
	}
}
}
