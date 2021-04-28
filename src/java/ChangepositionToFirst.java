/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.io.*;
public class ChangepositionToFirst{
   public static void main(String args[]){
     /*  public static void ArrangingZerofromFirst(int[] myarr, int k) {
        int count=0;
        for(int i=0;i<arr.length;i--)  {
            if(arr[i]==0){
                arr[count++]=arr[i];*/
      //Reading the array from the user
     int[] myArray={1,3,10,0,0,2,6};
		for(int i=0;i<myArray.length;i++){
			if(myArray[i]==0){
				int k=myArray[i];
				for(int j=0; j<=i ; j++){
					myArray[j]+=k;
					k=myArray[j]-k;
					myArray[j]-=k;					
				}
			}
		}
		for(int i = 0;i<myArray.length;i++)
			System.out.print(myArray[i]+"\t");
	}
}