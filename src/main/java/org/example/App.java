package org.example;

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
        int[][] arr = make(10,10);
        printArr(arr);
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
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void life(int[][] arr){

    }
}
