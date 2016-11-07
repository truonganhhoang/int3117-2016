/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

/**
 *
 * @author VuHongDiem
 */
public class JunitTesting {
    
    public int square(int x){
        return x*x;
    }
    
    public int countA(String word){
        int count = 0;
        for(int i = 0; i< word.length(); i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='A'){
                count++;
            }
        }
        return count;
    }
}
