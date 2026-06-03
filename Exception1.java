public class Exception1 {
public static void main(String[] args) {

    try{
        int result  = 10/0;
    }

    catch(ArithmeticException e){
        System.out.println("Arithmetic Exception");
    }
     catch(Exception e){
        System.out.println("Exception catch Block");
    }
   
   
   
    
}
}