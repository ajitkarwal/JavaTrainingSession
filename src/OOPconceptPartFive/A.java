package OOPconceptPartFive;

public class A {

    public A() { //explicitly written default constructor
        System.out.println("Parent Class Constructor");
    }

    public A(int i) {
        System.out.println("Parent class Constructor with value i = " + i);
    }

    public A(int i, int j) {
        System.out.println("Parent class Constructor with value i an j");
        System.out.println("This is invoked by super(a,b)");

    }


}
