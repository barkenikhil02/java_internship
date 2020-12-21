package classwork;

public class Convertdays {
	static final int DAYS_PER_WEEK = 7; 
    
    
    static void find(int days) 
    { 
        int year, week, dayss; 
          
        
        year = days / 365; 
        week = (days % 365) / 
                DAYS_PER_WEEK; 
        dayss = (days % 365) %  
                DAYS_PER_WEEK; 
          
        System.out.println("years = " + year); 
        System.out.println("weeks = " + week); 
        System.out.println("days = " + dayss); 
    } 
      
    
    public static void main(String[] args) 
    { 
        int days = 403; 
        find(days); 
    } 
}