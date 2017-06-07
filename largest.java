package dp;
import java.util.*;
public class largest {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter three numbers:");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    if(a>b&&a>c){
        System.out.println(a+"is largest number");
    }
    else if(b>a&&b>c){
        System.out.println(b+"is largest number");
    }
    else{
        System.out.println(c+"is largest number");
    }

    };
};



