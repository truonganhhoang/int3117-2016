/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1_ucln;

/**
 *
 * @author Chim
 */
public class BT1_UCLN {

    public static int UCLN(int a, int b){
                        while(a!= b){
                                    if(a>b) a= a-b;
                                    else b= b-a;
                        }
                        return (a);
            }
    
}
