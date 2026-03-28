public class practice {
    public static boolean distinct(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int x=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]==x) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("the array contain distinct element : "+distinct(arr));
    }
}
