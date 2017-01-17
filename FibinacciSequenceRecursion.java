
public class FibinacciSequenceRecursion {

    public static void main(String[] args) {
      fibonacci(10);
    }
    
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;  
        }
        int result = fibonacci(n-2)+fibonacci(n-1);
        System.out.println(result);
        return result;         
    }
     
}

 
   
