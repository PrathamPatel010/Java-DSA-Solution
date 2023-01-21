package com.pratham.Easy;

// find out how many time sorted array has been rotated
public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        int ans = countRotation(arr);
        System.out.println(ans);

    }

    // the answer is very simple. pivot element was the first element from which array started to rotate.
    // so we just need to return pivot+1. here, pivot+1 because it is 0-based index.
    static int countRotation(int[] arr){
        int pivot = findPivot(arr);
        return pivot+1;
    }

    // this method will not work for duplicate values
    static int findPivot(int[] arr){
        // pivot is the index of largest element in sorted rotated array
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            // case-1:
            if(mid<end && arr[mid]>arr[mid+1]){    // arr[] = [6,7,0]
                // mid is my pivot
                return mid;
            }
            // case-2:
            if(mid>start && arr[mid]<arr[mid-1]){    // arr[] = [7,0,1,2]
                // mid-1 is my pivot
                return mid-1;
            }
            // case-3:
            if(arr[start]>=arr[mid]){    // arr[] = [7,0,1,2]
                // all ele. after mid will be < start. hence, no need to check in right
                end = mid-1;
            }
            // case-4:
            if(arr[start]<=arr[mid]) {     // arr[] = [3,4,5,6,0]
                // all ele. before mid will be < mid. hence, no need to check in left.
                start = mid+1;
                // here, mid cannot be pivot. bcuz if it was pivot, it would have been caught in above cases. hence, ignore mid.
            }
        }
        return -1;
    }


}
