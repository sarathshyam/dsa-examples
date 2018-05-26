package io.dsaexamples.searching;

/**
 * Binary Search Example
 * Input: A Sorted Array and a Key.
 * Output: Returns the index if key is present. If not, returns -1
 *
 * Divide and Conquer.
 * Time Complexity O(N).
 * Space complexity O(1) since iterative approach is used.
 */
public class BinarySearch {

    private static int find(int[] a, int key){

        int low = 0;
        int high = a.length -1;

        /**
         *
         * In each ste, we divide the array into half. The left or right half is chosen by comparing
         * the key to the mid value and the other half is discarded.
         *
         * Steps:
         * 1. If Key == mid value of array return the index
         * 2. If Key > mid value search the right half
         * 3. ELSE earch the left half
         * 4. If not found return -1;
         */
        while(low <= high){
            int mid = low + (high - low)/2;
            if(a[mid] == key){
                return mid;
            }
            if(key > a[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] input = {1,5,18,20,35,46,70,90};
        int key = 71;
        System.out.println("Output is:" + find(input, key));
    }

}
