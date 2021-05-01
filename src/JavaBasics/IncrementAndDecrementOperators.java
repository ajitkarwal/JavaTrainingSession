package JavaBasics;

public class IncrementAndDecrementOperators {

    public static void main(String[] args) {
        int i = 1;
        int j = i++; //Post increment
        System.out.println("value of j is = "+j+" and i = "+i);

        int a = 1;
        int b= ++a; //pre increment. value of a is changed to 2. a=a+1
        System.out.println("value of b is = "+b+" and a = "+a);

    }
}
