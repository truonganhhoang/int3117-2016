/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HongDiem
 */
public class Path {
    public int returnInput(int x, boolean condition1, boolean condition2, boolean condition3){
        if (condition1)
		x++; 
	if(condition2)
		x--; 
	if(condition3)
		x=x;
	return x;
	}
	public static void main (String [] args)
		{int x=0;
		boolean condition1=true;
		boolean condition2=true;
		boolean condition3=true;
		Path constructorInstance=new Path();
		int methodReturn=constructorInstance.returnInput (x,condition1, condition2,condition3); 
    } 

    
}


