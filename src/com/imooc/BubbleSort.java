package com.imooc;

import java.sql.Array;

public class BubbleSort {
    public static void main(String[] args) {
		int[] arr= {6,5,45,34,23};
		int[] sort = sort(arr);
		for (int i = 0; i < sort.length; i++) {
			System.out.println(sort[i]);
		}
	}
    public static  int[] sort(int[] arr) {
    	for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
    	return arr;
    }
    
    
    
    public static int[]  bubbleSort(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
    	
    	return arr;
    }
}
