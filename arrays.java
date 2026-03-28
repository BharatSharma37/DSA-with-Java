import java.util.*;

public class arrays {

    // array input
    public static void arrInput(int[] arr, Scanner sc) {
        System.out.println("enter input for Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // array print
    public static void arrPrint(int[] arr) {
        System.out.println("Your array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // linear Search
    public static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    // binary search
    public static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int mid = arr.length / 2;
        while (start <= end) {
            if (arr[mid] == num) {
                return mid;
            } else if (num < arr[mid]) {
                end = mid - 1;
                mid = (start + end) / 2;
            } else if (num > arr[mid]) {
                start = mid + 1;
                mid = (start + end) / 2;
            }

        }
        return -1;
    }

    // reverse an array
    public static void reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        arrPrint(arr);
    }
    // printing pairs

    public static void pairArray(int[] arr) {
        System.out.println("Pairs : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }

    // printing subarrays
    public static void subArrays(int[] arr) {
        System.out.println("Subarrays : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + " ");
                }
                System.out.println();
            }

        }
    }

    // max sum subarray problem
    //bruteforc O(n^3)
    public static void maxSumn3(int[] arr) {
        System.out.println("max sum of Subarrays : ");
        int maxsum = Integer.MIN_VALUE;
        int currsum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    currsum += arr[j2];
                }
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
                System.out.println();
            }

        }
        System.out.println("Max sum by O(n^3) is "+ maxsum);

    }

    //O(n^2)
    public static void maxSumn2(int[]arr){
        int maxsum=0;
        int currsum;
        for (int i = 0; i < arr.length; i++) {
            currsum=0;
            for (int j = i; j < arr.length; j++) {
                currsum+=arr[j];
                if (currsum>maxsum) {
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max sum by O(n^2) is "+ maxsum);
    }

    //kedans theorem O(n)
    public static void kedans(int[]arr){
        int maxsum=0;
        int currsum=0;
        for (int i = 0; i < arr.length; i++) {
            currsum+=arr[i];
           

            if (maxsum<currsum) {
                maxsum=currsum;
            }
        }
        System.out.println("Max sum by Kedans O(n^1) is "+ maxsum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int lengthArray = sc.nextInt();
        int[] arr = new int[lengthArray];
        arrInput(arr, sc);
        arrPrint(arr);
        System.out.println("enter number to search in array : ");
        int num = sc.nextInt();
        System.out.println(
                "The Number " + num + " found in Array @ " + linearSearch(arr, num) + " index through linear Search");
        System.out.println(
                "The Number " + num + " found in Array @ " + binarySearch(arr, num) + " index through binary Search");
        // System.out.println("The Revers of array is "+ reverseArray(arr));
        reverseArray(arr);
        pairArray(arr);
        subArrays(arr);
        maxSumn3(arr);
        maxSumn2(arr);
        kedans(arr);

    }
}
