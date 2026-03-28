import java.util.*;
public class func {
    //binary to decimal
    public static double binToDec(int a){
        System.out.println(a);
        double dec=0;
        int las;
        int i=0;
        while(a!=0){
            las=a%10;
            dec+=las*Math.pow(i,2);
            i++;
            a=a/10;
        }
        return dec;
    }

    //Average of 3 numbers
    public static int Average(int a,int b,int c){
        return((a+b+c)/3);
    }
    //isEven
    public static String isEven(int a){
        return a%2==0?"Even":"Odd";
    }
    //isPallindrome
    public static String isPallindrome(int a){
        int original=a;
        int reverse=0;
        int remainder;
        while (a!=0) {
            remainder=a%10;
            reverse=reverse*10+remainder;
            a=a/10;
        }
        if (original==reverse) {
            return ("Pallindrome");
        }else
            return("Not Pallindrome");

    }
    public static void main(String args[]){
        System.out.println("decimal of 1110 is "+binToDec(1110));
        System.out.println("Average of 1,2,3  is "+Average(1,2,3));
        System.out.println("the number 40 is "+isEven(40));
        System.out.println("The Number 121 is "+isPallindrome(121));
        System.out.println(Integer.MIN_VALUE);
       
    }
}
