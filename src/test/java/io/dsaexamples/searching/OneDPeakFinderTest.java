package io.dsaexamples.searching;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sarath
 */
public class OneDPeakFinderTest {

    @Test
    public void peakOfSingleItemArray(){
        int[] input = {3};
        int peakIndex = getPeak(input);
        Assert.assertEquals(0, peakIndex);
    }

    @Test
    public void peakOfSortedArray(){
        int[] input = {1,2,3,5,6,9,10,12};
        int peakIndex = getPeak(input);
        Assert.assertEquals(7, peakIndex);

    }

    @Test
    public void peakOfReverseSortedArray(){
        int[] input = {12,10,9,6,5,3,2,1};
        int peakIndex = getPeak(input);
        Assert.assertEquals(0, peakIndex);

    }

    @Test
    public void peakOfRandomArray(){
        int[] input = {1,3,5,6,9,10,12,2};
        int peakIndex = getPeak(input);
        Assert.assertTrue((peakIndex == 0 || input[peakIndex] >= input[peakIndex-1]) &&
                (peakIndex == input.length-1 || input[peakIndex] >= input[peakIndex+1]));

    }


    private int getPeak(int[] arr){
        return OneDPeakFinder.findIndexOfPeak(arr, arr.length);
    }

}
