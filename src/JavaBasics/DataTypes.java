package JavaBasics;

/*  1 .Convention: All keywords should start with small letter. example package is a keyword.
    2. Convention: method should start with small letter. example here is main()*/
//  3. every statement must end with semicolon (;)

//main(): is the starting or execution point of program
public class DataTypes {
    public static void main(String[] args) {

        //PRIMITIVE DATATYPE : int, double, boolean, char
        //declare a variable
        // variable type <variable Name>;

//      int DataType: non-decimal numbers
        int i1;
        i1=4;        // OR
        int i2 = 6;
        //also we can
        i1=i2;
        //now i1 = 6 not 4
        System.out.println("This is integer datatype example: "+ i1);

//      double DataType: decimal numbers

        double d1 = 45.987;
        double d2 = 13.98;
        // we can store int in double but not the other way around

        System.out.println("This is double datatype example: "+ d1);
        System.out.println("sum of i1 and d1 is : "+ (i1+d1));



//      char DataType: just like a symbol. with single character and in single quotes. loke :
        char c1='5'; /*here 5 is not integer or any number. it is just a character like # or * etc
                        it can be a number, an alphabetic character, or special symbol*/

        System.out.println("This is char datatype example: "+ c1 );


//      boolean : The value of a boolean variable is either true or false. like:
        boolean b1= true; //true and false are values but they are also keywords available in java.
        boolean b2 = false;
        System.out.println("This is boolean datatype example: b1 =" + b1 );


//      String :    String is a class not a datatype but it can be used as a DataType. Thats why it starts with capital letter (S)
//                  The value of a boolean variable is either true or false. like:
        String s1 = "Hello World";
        String s2 = "This is my first java code";
        String s3 = "1000";  /* like char this 1000 is not a numeric value (int or double),
                                 but a string of characters. String is not primitive datatype */

        System.out.println("This is String Object value example: "+ s1);



    }
}
