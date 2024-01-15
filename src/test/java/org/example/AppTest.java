package org.example;

import org.junit.*;

import static org.example.App.*;
import static org.junit.Assert.assertEquals;

public class AppTest {
    int[][] arr = make(5,5);

    @Test
    public void countNeighborsTest(){
        int expected = countNeighbors(arr,3,3);
        int actual = 2;
        assertEquals(expected,actual);
    }
    @Test
    public void printArrTest(){
        printArr(arr);
    }

}
