package finalVSfinallyVSfinalize;
//finally is a always used with try..catch
public class FinallyConcept {

    public static void main(String[] args) {

       // test1(); // we are able to call method without creating object coz it is static
      //  test2();
        division();

    }

    public static void test1(){
        try{
            System.out.println("inside test1 method");//first this runns
            throw new RuntimeException("test"); //then   compiler throws this exception. it will
                                            //go to catch block
        }catch(Exception e){
            System.out.println("inside catch block");

        }

        finally // even if the exception is thrown, this block will execute anyway
        {
            System.out.println("inside finally block");
        }
        //finally is a always used with try..catch



    }
    
    public static void test2(){

        try{
            System.out.println("inside test2");
        }
        finally//there is no exception in try. still finally block will run. so it does not
                //matter if exception is coming or not, finally block will be executed always
        {
            System.out.println("finally code in test2 method");
        }
    }
    public static void division(){
        int i=10;
        try{
            System.out.println("inside try block");
            int k = i/0;
            //throw new ArithmeticException("divided by zero");
        }catch(ArithmeticException e){
            System.out.println("inside catch block");

            System.out.println("divided by zero");
        }

        finally
        {
            System.out.println("execute this block any way");
        }
    }


}
