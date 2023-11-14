import java.math.BigDecimal;
import java.math.RoundingMode;


/*
This is Lab 5.1 Arrays
Author: Alexis C.
Date: Friday 11-10-2023
 */

public class ArrayUtility {

    public static void print(int[] array) {
        for(int i=0; i<array.length; i++){
            if(i == array.length - 1){
                System.out.print(array[i]+"\n");
            }
            else{
                System.out.print(array[i]+", ");
            }
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double)sum/ array.length;
        average = (int)(average*100);
        average = (double) average / 100;
        return average;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static void reverseTwo(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int number : array) {
            if (number == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String string : array) {
            if (string.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        String str = "";
        for (int i = 0; i < array.length - 1; i++) {
            str += array[i] + ", ";
        }
        str += array[array.length - 1];

        return str;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void shiftRight(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int lastElement = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = lastElement;

    }

    public static void shiftLeft(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int firstElement = array[0];

        for (int i = 0 ; i<array.length-1 ; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = firstElement;

    }


    public static void shiftRightNTimes(int[] array, int n) {
        if (array.length <= 1 || n <= 0) {
            return; // No need to shift if the array has 0 or 1 element, or n is non-positive
        }

        for (int shiftCount = 0; shiftCount < n; shiftCount++) {
            int lastElement = array[array.length - 1];

            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }

            array[0] = lastElement;
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        if (array.length <= 1 || n <= 0) {
            return; // No need to shift if the array has 0 or 1 element, or n is non-positive
        }

        for (int shiftCount = 0; shiftCount < n; shiftCount++) {
            int firstElement = array[0];

            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            array[array.length - 1] = firstElement;
        }

    }


}
