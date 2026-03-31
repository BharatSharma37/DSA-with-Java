public class stringCompress {
    public static String stringCompress(String str){
        String compressed="";
        int count=1;
        for (int i = 0; i < str.length(); i++) {
             count=1;
            compressed+=str.charAt(i);
            if (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
                while (str.charAt(i)==str.charAt(i+1)) {
                    count++;
                    i++;
                }
                compressed+=count;
            }
            
        }
        return compressed;
    }
    public static void main(String[] args) {
        String str="aaabaaaccdf";
        System.out.println("The compressed string of "+str+" is : "+stringCompress(str));
        System.out.println("s"=="s");
    }
}
