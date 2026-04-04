import java.util.*;
public class bitwise {
    public static String evenOdd(int num){
        if ((num&1)==0) {
            return "even";
        }else
            return "odd";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("the number "+num+" is "+evenOdd(num));
    }
}
