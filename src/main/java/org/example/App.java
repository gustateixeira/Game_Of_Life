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
        int[][] arr = make(10,10);
        printArr(arr);
        int[][] next = make(10,10);
        System.out.println();
        printArr(next);
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
    public static void life(int [][] arr){
        int[][] nextArr = make(10,10);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int count = countNeighbors(arr);
//                int sum = 0;
//                sum+= nextArr [i-1][j - 1];
//                sum+= nextArr [i-1][j];
//                sum+= nextArr [i-1][j + 1];
//                sum+= nextArr [i][j - 1];
//                sum+= nextArr [i][j + 1];
//                sum+= nextArr [i+1][j - 1];
//                sum+= nextArr [i+1][j];
//                sum+= nextArr [i+1][j + 1];


            }
        }        

    }
    public static int countNeighbors(int[][] arr, int x,int y){
        int sum = 0;
        for (int i = 0;i < 2; i++){
            for(int j = 0; j < 2; j++){
                sum += arr [i][j];
            }
        }
        sum -= arr[x][y];
        return sum;
    }
}
