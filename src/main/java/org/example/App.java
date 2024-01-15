package org.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[][] arr = make(5,5);
        printArr(arr);
        System.out.println();
        System.out.println(countNeighbors(arr, 3,3));
    }

    public static int [][] make(int cols, int rows){
        Random r = new Random();
        int[][] arr = new int [cols] [rows];
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = r.nextInt(2);
            }
        }
        return arr;
    }
    public static void printArr(int[][] arr){
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
    public static void life(int [][] arr){
        int[][] nextArr = make(10,10);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int count = countNeighbors(arr,i,j);


            }
        }        

    }
    public static int countNeighbors(int[][] arr, int x,int y){
        int sum = 0;
        if(x != 0 && y!= 0) {
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    sum += arr[i][j];
                }
            }
        }
        else{

        }
        sum -= arr[x][y];
        return sum;
    }
}
