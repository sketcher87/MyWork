/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.*;
public class ChangepositionToEnd {
    
	public static void pushZerosToEnd(int[] arr, int n) {
        int count=0;
        for(int i=0;i<arr.length;i++)  {
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        for(int j=count;j<n;j++){
            arr[count++]=0;
            }
        }
	public static void main(String[] args) {
		int arr[]= {1,3,10,0,0,2,6};
		pushZerosToEnd(arr,7);
		for(int i=0;i<7;i++){
	          System.out.print(arr[i]+"\t");
		}
        }
}				
				