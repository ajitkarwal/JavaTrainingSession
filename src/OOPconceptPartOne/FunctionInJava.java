package OOPconceptPartOne;

public class FunctionInJava {
    public static void main(String[] args) {

        //one object is created below. onj is reference variable, referring to this object
        // after creating the object, the copy of all non static method is given this object.
        // not main() method as it is static.
        // objects cannot hold static methods.
        FunctionInJava obj = new FunctionInJava();

        obj.test();
        obj.pqr();  // this will execute pqr() and print "PQR method" but the value of
                    // obj.pqr() is c i.e. 50. as it is returning int c

        int sum = obj.pqr();
        System.out.println(sum);

        obj.qa(); /// it will execute qa(), but it also has a value of string type so -->
        String s = obj.qa();
        System.out.println(s);

        int div = obj.division(30,10); // one to one mapping. 30 will be give to x and 10 to y
                            //its value is 3 (30/10=3)

        System.out.println(div );


    }

    public void test(){ //no input, no output (no return)
        System.out.println("test method");
    }
    public int pqr(){ //no input, but some output
        System.out.println("PQR method");
        int a=20;
        int b = 30;
        int c = a+b;
        return c;

    }
    public String qa(){ //no input, but some output
        System.out.println("qa method");
        String s = "Selenium";
        return s;
    }


    //-->input to method is done this way
    public int division(int x, int y){ //x, y --> are input parameters/arguments
        System.out.println("Division Method");
        int d = x/y;
        //System.out.println("Division is : "+d);

        return d;

    }
}
