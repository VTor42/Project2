/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibinacci.sequence.recursion;

/**
 *
 * @author viktoriagrossman
 */
public class FibinacciSequenceRecursion {

    public static void main(String[] args) {
   
    /**
     *
     * @param n
     * @return
     */
    
public static int fibonacci(int n){
        if(n == 0 || n==2)
            return 0;
            return 1;   
    }
     return fibonacci(n-1);
    }

 
   
