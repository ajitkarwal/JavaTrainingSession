package JavaBasics;
// + :- is a concatenation operator. it is used to concatenate two strings
//println :- add \n newline character at the end of each statement
//print :- no new line at the end of each statement
public class StringConcatenation {
    public static void main(String[] args) {


        int a = 100;
        int b= 200;
        String x = "Hello";
        String y = "World";
        double d1 = 12.98;
        double d2 = 150.89;
        char c1 ='*';
        char c2 = '&';

        System.out.println(a+b);
        System.out.println(x+y);
        System.out.println(a+b+x+y); // execution starts from left to right.
                                    //firs a+b is calculated and then concatenated to x and
                                    // then it will be concatenated to y. ans will be 300HelloWorld

        // that is how this common statement works.
        System.out.println("The value of a and b is : "+a+" and "+b);
        //"The value of a and b is : " is string and 'a' and 'b' are variables

        System.out.println(x+y+a+b);
                    //here firs hello + world + 100 + 200. coz execution starts from left to right.
                    // so ans will be HelloWorld100200

        System.out.println(x+y+(a+b)); //output will be HelloWorld300.
                                        // as a+b will be calculated separately


        System.out.println(x+d1+(a+b)+x+d2+y+a);
        System.out.println(x+a+c1+b+c2);
        System.out.println(c1+c2); // it wont concatenate two characters. the output is 80

        System.out.print("Automation");
        System.out.println("for selenium"); //printl add \n newline character at the end of each statement


    }
}
