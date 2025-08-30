public class FinallyBlockExp {
    
    public static void main(String args[]){   

    try {    

    System.out.println("Inside try block");  
     int data=25/0;    //code throws divide by zero exception  
     System.out.println(data);    
    }     
    catch(ArithmeticException e){  
      System.out.println( e+" "+"Exception handled");  
    }    
    finally {  
      System.out.println("finally block is always executed");  
    }    

    System.out.println("rest of the code...");    
    }    
  }  