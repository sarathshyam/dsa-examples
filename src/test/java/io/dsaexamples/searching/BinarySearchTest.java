package io.dsaexamples.searching;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sarath
 */
public class BinarySearchTest {

    @Test
    public void itemNotFound() {
        int[] input = {1,5,18,20,35,46,70,90};
        Assert.assertEquals(-1, BinarySearch.find(input, 71));
    }

    @Test
    public void itemFound(){
        int[] input = {1,5,18,20,35,46,70,90};
        Assert.assertEquals(4, BinarySearch.find(input, 35));
    }

    @Test
    public void singleItemArray(){
        int[] input = {4};
        Assert.assertEquals(0, BinarySearch.find(input, 4));
    }

    @Test
    public void itemIsLastElement(){
        int[] input = {1,5,18,20,35,46,70,88,90};
        Assert.assertEquals(8, BinarySearch.find(input, 90));
    }
}
