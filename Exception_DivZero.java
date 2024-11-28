class DivByZero extends Exception{
    public DivByZero(String message){
        super(message);
    }
}
public class Exception_DivZero {
    public static void main(String[] args) {
        int numerator=10;
        int denominator=0;
        try{
            if(denominator==0) {
                throw new
                        DivByZero("division by zero is not possible");
            }
            int remainder=10%0;
            System.out.println("result modulus:"+remainder);
            int result=numerator/denominator;
            System.out.println("result of division:"+result);

            }catch(DivByZero e){
            System.out.println("error:"+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Error:Division by zero occured");
        }
        finally{
            System.out.println("finally block executed");
        }
    }

}
