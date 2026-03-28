import java.util.Arrays;

public class trapping_RainWater {
    //lft max auxillary array
    public static int[] leftMax(int[]arr){
        int[]leftMax = new int[arr.length];
        leftMax[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>leftMax[i-1]) {
                leftMax[i]=arr[i];
            }else{
                leftMax[i]=leftMax[i-1];
            }
        }


        return leftMax;
    }
    //right max Auxillary array
    public static int[] rightMax(int[]arr){
        int[]rightMax = new int[arr.length];
        rightMax[arr.length-1]=arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i]>rightMax[i+1]) {
                rightMax[i]=arr[i];
            }else{
                rightMax[i]=rightMax[i+1];
            }
        }


        return rightMax;
    }
    //trapped water
    public static int trappedWater(int[]arr,int[]leftMax,int[]rightMax){
        int trappedWater=0;
        int[] waterAboveBar=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            waterAboveBar[i]=Math.min(leftMax[i],rightMax[i])-arr[i];
        }
        for (int j = 0; j < waterAboveBar.length; j++) {
            trappedWater+=waterAboveBar[j];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int[] barHeight={4,2,0,6,3,2,5};
        int[] leftMax=leftMax(barHeight);
        int[] rightMax=rightMax(barHeight);
        System.out.println("leftMax : "+Arrays.toString(leftMax));
        System.out.println("rightMax : "+Arrays.toString(rightMax));
        //trapped water
        System.out.println("Th total Water Trapped is : "+trappedWater(barHeight, leftMax, rightMax));
    }
}
