package org.example;

import java.util.Arrays;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");
        int[][] arr = make(50, 50);
        AppGraphic g = new AppGraphic(arr);
        int[][] nextArr = life(arr);
        while(count(nextArr) != 0){
            arr = nextArr;
            nextArr = life(arr);
            g.refresh(nextArr);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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
    public static int[][] life(int [][] arr){
        int[][] nextArr = make(arr.length ,arr.length);
        for (int i = 0; i < nextArr.length; i++) {
            for (int j = 0; j <  nextArr.length; j++) {
                int count = countNeighbors(arr,i,j);
                if(count == 3){
                    nextArr[i][j] = 1;
                } else if (count < 2) {
                    nextArr[i][j] = 0;
                }else if(count == 2){
                    nextArr[i][j] = arr[i][j];
                }
                else{
                    nextArr[i][j] = 0;
                }

            }
        }
        return nextArr;

    }
    public static int countNeighbors(int[][] arr, int x,int y){
        int sum = 0;
        if(x == 0 && y== 0) {
            for (int i = x; i <= x + 1; i++) {
                for (int j = y; j <= y + 1; j++) {
                    sum += arr[i][j];
                }
            }
            sum -= arr[x][y];
            return sum;
        }
        if(x == 0 && y != arr.length -1){
            for (int i = x ; i <= x + 1; i++) {
                for (int j = y -1 ; j <= y + 1; j++) {
                    sum += arr[i][j];
                }
            }
            sum -= arr[x][y];
            return sum;
        }
        if(y == 0 && x > 0){
            for (int i = x - 1; i <= x; i++) {
                for (int j = y ; j <= y + 1; j++) {
                    sum += arr[i][j];
                }
            }
            sum -= arr[x][y];
            return sum;
        }
        if(x == arr.length - 1 && y != arr.length - 1){
            for (int i = x - 1; i <= x; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    sum += arr[i][j];
                }
            }
            sum -= arr[x][y];
            return sum;
        }
        else if(x == arr.length - 1 && y == arr.length -1){
            for (int i = x - 1; i <= x; i++) {
                for (int j = y - 1; j <= y ; j++) {
                    sum += arr[i][j];
                }
            }
            sum -= arr[x][y];
            return sum;
        }
        else if(x == arr.length - 1 && y == 0){
            for (int i = x - 1; i <= x; i++) {
                for (int j = y; j <= y + 1; j++) {
                    sum += arr[i][j];
                }
            }
            sum -= arr[x][y];
            return sum;
        }
        else if(y == arr.length - 1 && x != 0){
            for (int i = x - 1; i <= x+1; i++) {
                for (int j = y - 1; j <= y ; j++) {
                    sum += arr[i][j];
                }
            }
            sum -= arr[x][y];
            return sum;
        }

        else if(y == arr.length - 1 && x == 0){
            for (int i = x; i <= x+1; i++) {
                for (int j = y - 1; j <= y ; j++) {
                    sum += arr[i][j];
                }
            }
            sum -= arr[x][y];
            return sum;
        }
        else{
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    sum += arr[i][j];
                }
            }
        }
        sum -= arr[x][y];
        return sum;
    }
    public static int count(int [][] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                        count += arr[i][j];
            }
        }
        return count;
    }


}
