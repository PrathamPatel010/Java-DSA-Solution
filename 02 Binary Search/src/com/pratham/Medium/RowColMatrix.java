package com.pratham.Medium;
//  https://practice.geeksforgeeks.org/problems/search-in-a-matrix17201720/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-a-matrix
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };
        int ans = matSearch(arr, arr.length, arr[0].length,37);
        System.out.println(ans);

    }

    public static int matSearch(int matrix[][], int N, int M, int target){
        int row = 0;
        int col = M-1;
        while(row<N && col>=0){
            if(matrix[row][col]==target){
                // we have found the answer,just return 1
                return 1;
            } else if(matrix[row][col]>target) {
                // all the elements after this row must be greater than target, we traverse in this row
                col--;
            } else{
                // all elements above this row must be lesser than target, we traverse in next row
                row++;
            }
        }
        // out of loop, we couldn't find element.
        return 0;
    }
}
