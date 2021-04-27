
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class option1 {
     public static void main(String []args){
    	 String Ans;
        int originalPosition1=3;
        int originalPosition2=4;
        int newPosition1=5;
        int newPosition2=6;
        int [] myArray ={1,3,10,0,0,2,6};
        int temp1= myArray[originalPosition1];
        int temp2= myArray[originalPosition2];
        myArray[originalPosition1] = myArray[newPosition1];
        myArray[originalPosition2] = myArray[newPosition2];
        myArray[newPosition1]=temp1;
        myArray[newPosition2]=temp2;
        System.out.println(Ans = Arrays.toString(myArray));
     }
    
}
