package OOPconceptPartOne;

public class WrapperClass {

    public static void main(String[] args) {
        String x="100";  //100 is not numeric here
        String y="20.9";

        System.out.println(x+20);// it will give 10020

       // to convert x to numeric we need wrapper class
        //Integer, Double, Character, Boolean, Float, String
   //    int i =  Integer.parseInt(x);
        System.out.println(Integer.parseInt(x)+20); //it will give 120
        System.out.println(Double.parseDouble(y)+5);

        String k = "false";
        System.out.println(Boolean.parseBoolean(k));

        // for String it (String.valueOf) to convert anything to string

        int n = 200;
       // String s = String.valueOf(n);
        System.out.println(String.valueOf(n)+20);// it will give 20020

// if it is not pure numeric value. like :
        String a = "100A";

        System.out.println(Integer.parseInt(a)); // it will throw NumberFormatException


    }
}
