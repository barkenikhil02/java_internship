package classwork;

public class Sum {

    public static void main(String[] args) {

        int num = 10, sum = 0;
        int i = 1;

//        for(i=1; i <= num; ++i)
//        {
//            
//            sum += i;
//        }
        
        while(i <= num) {
        	sum += i;
        	i = i + 1;
        }
        	
        

        System.out.println("Sum = " + sum);
    }
}