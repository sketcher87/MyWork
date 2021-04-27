
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class option2 {
   public static void main(String []args){
    ArrayList a;	
	    ArrayList al= new ArrayList();
	    al.add(1);
	    al.add(3);
	    al.add(10);
	    al.add(0);
	    al.add(0);
	    al.add(2);
	    al.add(6);
	    int item1=0;
	    int item2=0;
	    int itemPos1= al.indexOf(item1);
	    int itemPos2= al.indexOf(item2);
	    al.remove(itemPos1);
	    al.remove(itemPos2);
	    al.add(0,item1);
	    al.add(0,item2);
	    System.out.println(a= al);
    }
}
    

