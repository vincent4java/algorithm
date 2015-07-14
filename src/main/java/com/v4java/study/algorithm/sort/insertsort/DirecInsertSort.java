package com.v4java.study.algorithm.sort.insertsort;

import java.util.Random;

/**
 * 直接插入排序:
 * 插入排序是在一个已经有序的小序列的基础上，一次插入一个元素。当然，刚开始这个有序的小序列只有1个元素，也就是第一个元素（默认它有序）。
 * 比较是从有序序列的末尾开始，也就是把待插入的元素和已经有序的最大者开始比起，如果比它大则直接插入在其后面。
 * 否则一直往前找直到找到它该插入的位置。如果遇见一个与插入元素相等的，那么把待插入的元素放在相等元素的后面。
 * 所以，相等元素的前后顺序没有改变，从原无序序列出去的顺序仍是排好序后的顺序，所以插入排序是稳定的。
 * @author vincent
 *
 */
public class DirecInsertSort {

	public static void main(String[] args) {
		int[] arr =new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= new Random().nextInt(10000);
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
			int j = i -1;
			while (j>=0&&arr[j]>key) {
				arr[j+1] = arr[j];
				j --;
			}
			arr[j+1] = key;
		}
	}
}
