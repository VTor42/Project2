/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.sequence;

/**
 *
 * @author viktoriagrossman
 */
public class FibonacciSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0;
        int b=1;
        int r;
        
        for(int d=0; d<=10; d++){
            System.out.println(b);
            r=a+b;
            a=b;
            b=r;
        }
    }
    
}
