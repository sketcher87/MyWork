/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Main {
    public static void main(String []args, ChagepositionToEnd ChangepositionToEnd, ChangepositionToFirst ChangepositionToFirst){
        Scanner scanObj=new Scanner(System.in);
        System.out.print("Press 1");
        int fNum=scanObj.nextInt();
        
        System.out.println("Press 2");
        int sNum=scanObj.nextInt();
        
        ChangepositionToEnd= new ChagepositionToEnd();
        ChangepositionToFirst=new ChangepositionToFirst();
    }

    private static class ChagepositionToEnd {
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
    private static class ChangepositionToFirst{
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
}


