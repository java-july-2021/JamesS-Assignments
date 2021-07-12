import java.util.ArrayList;
import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        //numTo255();
        //OddNum();
        //printSum();
        int[] arr1 = { 1, 3, 5, 7, 9, 11, 13 };
        getArrayNum(arr1);
        //int[] arr2 = { -3, -5, -7 };
        //findMax(arr2);
        //int [] arr3 = {2,2,2};
        //getAverage(arr3);
        //oddArray();
        
        //int[] arr4 = {1,5,10,-2};
        //greaterThanY(arr4, 3);
        
        //int[] mma =maxMinAverage(arr4);
        //System.out.println(Arrays.toString(mma));
    }

    public static void numTo255() {
        for (int i = 0; i <= 255; i++)
            System.out.println(i);
    }

    public static void OddNum() {
        for (int i = 1; i <= 255; i+=2) {
            //if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static void getArrayNum(int[] x) {
        //int sum = 0;
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);//sum += numbers[i];
        }
        
    }

    public static void printSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum = i + sum;
            System.out.println("New number: " + i + "Sum: " + sum);
        }
    }

    public static void LoopArray(int[] arr) {
        for (int val : arr)
            System.out.println(val);
    }

    public static void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[1] > min) {
                min = arr[i];
            }
        }
        System.out.println();
    }

    public static void getAverage(int[] arr) { // double and nums
        int sum = 0;// (nums);
        int avg = 0;// sum/nums.length;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        avg = sum / arr.length;
        System.out.println(avg);

    }

    public static void oddArray() {
        ArrayList<Object> nums = new ArrayList<Object>();
        for (int i = 0; i <= 255; i++) {
            if (i % 2 != 0)
                nums.add(i);
        }
        System.out.println(nums);
    }

    public static void greaterThanY(int[] arr, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {// for(int num: arr) {
            if (arr[i] > y) {// if(num > y)
                count++;
            }
        }
        System.out.println(count);

    }

    public static void squareArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void eliminateNegatives(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                ;
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static int[] maxMinAverage(int[] arr) {
        int[] newArr = new int[3];// int min = findMin(nums);
        int max = arr[0];// int max = findMax(nums);
        for (int i = 1; i < arr.length; i++) {// avg = getAverage(nums);
            if (arr[i] > max) {
                max = arr[i];
            } // System.out.println(String.format("Max: %d, Min: %d, Average: %f",max, min,
              // avg));
        }
        newArr[0] = max;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        newArr[1] = min;
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        avg = sum / arr.length;
        newArr[2] = avg;
        return newArr;
    }

public static void shiftArrayValues(int[] x) {
    for (int i = 1; i <x.length; i++) {
        x[i-1] = x[i];
    }
    x[x.length-1] = 0;
}
}
