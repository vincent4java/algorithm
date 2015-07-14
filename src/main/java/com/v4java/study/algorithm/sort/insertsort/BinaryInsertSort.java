package com.v4java.study.algorithm.sort.insertsort;

import java.util.Random;

/**
 * 二分法插入排序
 * 在直接选择中进行优化，因为当所选i时，前i-1项已经有序，所以使用二分法找到合适位置
 * 比较次数为n^2/2
 * @author vincent
 *
 */
public class BinaryInsertSort {
	public static void main(String[] args) {
		int[] arr =new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= new Random().nextInt(100);
		}
		sort(arr);
		for (int i : arr) {
			System.err.print(i+" ");
		}


	}
	

	
	public static void sort(int[] arr){
		int key = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			int left = 0;
			int right = i -1;
			int m = 0;
			while (left<=right) {
				m = (left+right)/2;
				if (key < arr[m]) {
					right = m -1;
				}else {
					left = m+1;
				}
			}
			for (int k = i -1; k >= left; k --) {
				arr[k+1] = arr[k];
			}
			arr[left] = key;
		}
	}
}
