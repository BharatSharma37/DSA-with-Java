import java.util.*;
public class bitOperation {
    public static int getIthBit(int number,int i){
        int bitmask=1<<i;
        if ((number & bitmask)==0) {
            return 0;
        }else
            return 1;
    }
    public static int setIthBit(int number,int i){
        int bitmask=1<<i;
        return(number|bitmask);
        
    }
    public static int clearBit(int number,int i){
    int bitmask=(~0)<<i;
    return(number&bitmask);
    }
    public static int clearRangeBit(int number,int i , int j){
        int bitmask=((~0)<<i+1|(1<<j-1));
        return (number&bitmask);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number=sc.nextInt();
        System.out.println("Enter the i : ");;
        int i=sc.nextInt();
        System.out.println("Enter the j : ");;
        int j=sc.nextInt();
        System.out.println("the binary bit of "+number+" at "+i+"th position is "+getIthBit(number,i));;
        System.out.println("After setting "+i+"th bit the number became "+setIthBit(number, i));
        System.out.println("Ater clearning last "+i+"th bit the number became "+clearBit(number, i));
        System.out.println("After clarning the range of "+i+"ith bit to "+j+"th bit the number became "+clearRangeBit(number,7,2 ));
    }
}