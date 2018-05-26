package io.dsaexamples.searching;

/**
 * One Dimensional Peak finding using divide and conquer
 *
 * @author Sarath
 */
public class OneDPeakFinder {

    private static int findIndexOfPeak(int[] array, int lowIndex, int highIndex, int arrayLen){

        int midIndex = lowIndex + (highIndex-lowIndex)/2;

        if((midIndex ==0 || array[midIndex] >= array[midIndex - 1]) &&
                (midIndex == arrayLen - 1 || array[midIndex] >= array[midIndex + 1])){
            return  midIndex;
        }else if(array[midIndex -1] > array[midIndex]){
            //there will be one peak in the left half
            return findIndexOfPeak(array, lowIndex, midIndex-1, arrayLen);
        }else{
            //there will be one peak in the right half
            return findIndexOfPeak(array, midIndex + 1, highIndex, arrayLen);
        }

    }

    /**
     * Returns the index of any one peak of an array.
     * A peak is any item in the array which is greater than its immediate neieghbours.
     *
     * ie; ai is peak if ai >= a(i-1) and ai >= a(i+1)
     *
     * Consider corner cases for first item, last item and single item arrays.
     *
     * @param array
     * @param arrayLen
     * @return
     */
    public static int findIndexOfPeak(int[] array, int arrayLen){
        return findIndexOfPeak(array, 0, arrayLen-1, arrayLen);
    }


}
