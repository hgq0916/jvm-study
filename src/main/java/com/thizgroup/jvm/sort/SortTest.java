package com.thizgroup.jvm.sort;

import java.util.Arrays;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.jvm.sort.SortTest
 * @Description: TODO
 * @date 2020/5/28 11:07
 */
public class SortTest {

  /**
   * 冒泡排序
   */
  public static void bubblingSort(int[] arr ){

    boolean isChanged = false;

    int count = 0;

    for(int i=0;i<arr.length;i++){
      isChanged = false;
      for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          isChanged = true;
        }

        count++;
      }
      if(!isChanged){
        //没有发生置换
        break;
      }
    }

    System.out.println(count);
  }

  /**
   * 选择排序
   * @param arr
   */
  public static void choiceSort(int[] arr){
    //从数组中找到最小的一个放到第一个位置，依次类推
    int min = 0;//第一个最小
    for(int i=0;i<arr.length;i++){

      min = i;

      for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[min]){
          min = j;
        }
      }

      if(min != i){
        //交换
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
      }

    }
  }

  /**
   * 快速排序
   * @param arr
   */
  public static void quickSort(int[] arr,int L,int R){

    int i = L;
    int j = R;
    int m = arr[(L+R)/2];

    while(i<=j){
      while (arr[i]<m) i++;
      while(arr[j]>m) j--;

      if(i<=j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }

    if(i<R){
      quickSort(arr,i,R);
    }
    if(j>L){
      quickSort(arr,L,j);
    }
  }

  /**
   * 插入排序
   * @param arr
   */
  public static void insertSort(int[] arr){
    int temp =0;

    for(int i=1;i<arr.length;i++){

      temp = arr[i];
      int j = i -1;

      while (j>=0 && arr[j]>temp) {
        arr[j+1] = arr[j];
        j--;
      }

      arr[j+1] = temp;
    }
  }


  public static void main(String[] args) {
    int[] arr = {15,18,12,39,10,4,8};
    //bubblingSort(arr);//冒泡排序
    //choiceSort(arr);//选择排序
    //quickSort(arr,0,arr.length-1);
    insertSort(arr);
    System.out.println(Arrays.toString(arr));
  }

}
