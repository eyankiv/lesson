package com.company;

public class Main {

    public static void main(String[] args) {
        int [] x= {12,17,11,15,16,24};
        sortArray(x);
        //reverseArr(x);
    }

    public static void printArr(int [] arr){
        if(arr ==null || arr.length==0) {
            System.out.println("Null array");
        }
        System.out.print("{"+arr[0]+",");
        for (int i = 1; i <arr.length-1; i++)
            System.out.print(arr[i]+",");
        System.out.print(arr[arr.length-1]+"}");
    }

    public static int abs(int x){
        if(x<0)
            return -x;
        return x;
    }

    int temp = 0;
    public static void reverseArr(int [] arr){
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            int revPos = arr.length-1-i;
            arr[i] = arr[arr.length-1-i];
            arr[revPos] = temp;
        }

       printArr(arr);
    }

    public static int maxSubArray(int[] nums){
        int maxSoFar = 0;
        int maxEndingHere = 0;
        for (int i = 0; i < nums.length; i++) {
            maxEndingHere += nums[i];
            if (maxEndingHere<0)
                maxEndingHere = 0;
            if (maxSoFar<maxEndingHere)
                maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }

    public static void sortArray(int [] arr){
        boolean isSort = false;
        int upTo = arr.length-1;
        int temp;
        while(!isSort){ //same as isSort==false;
            isSort = true;
            for (int i = 0; i < upTo; i++) {
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]= temp;
                    isSort = false;
                }
            }
            upTo--;
        }
    printArr(arr);
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right){ // use two sorted array, take out one and compare and keep going.
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left+i];
        for (int i = 0; i < n2; i++)
            rightArray[i] = arr[middle+ 1 +i];
        int i =0, j = 0;
        int k = left;
        while(i <n1 && j <n2){
            if (leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[] arr, int left, int right){
        if (left < right){
            int middle = (left+right)/2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr,left, middle, right);
        }
    }


}