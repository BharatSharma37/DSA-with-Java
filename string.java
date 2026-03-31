public class string {
    public static boolean pallindrome(String str){
        for (int index = 0; index < str.length()/2; index++) {
            if (str.charAt(index)!=str.charAt(str.length()-index-1)) {
                return false;
            }
        }
        return true;
    }

    public static float shortestPath(String path){
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i)=='E') {
                x++;
            }else if (path.charAt(i)=='W') {
                x--;
            }else if (path.charAt(i)=='N') {
                y++;
            }else if (path.charAt(i)=='S') {
                y--;
            }
        }
        return (float)(Math.sqrt((y*y)+(x*x)));
    }
    public static void main(String[] args) {
        String str="Bharat";
        System.out.println("the length of the string Bharat is : "+ str.length());
        //using mrthod charAt
        System.out.println("the char at index 0 is : "+ str.charAt(0));
        System.out.println("the string "+str+" is pallindrome: "+pallindrome(str));
        //shortest path question using shortestest distanc path formula for coordinatees
        String path="NSNNN";
        //E IS EAST AND SAME AS OF IT
        //THE SHORTEST PATH IS CALCULATING FROM ORIGIN (0,0)
        System.out.println("the shortest path from origin to this path "+path+" is : "+shortestPath(path));
    }
}