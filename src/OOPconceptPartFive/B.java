package OOPconceptPartFive;

/*
CALL TO  'super()' MUST BE FIRST STATEMENT IN CHILD CLASS CONSTRUCTOR BODY
 */
public class B extends A {

    public B() {//default constructor
// this is explicitly calling super sass constructor
        super(10);// it will search Class A constructor with one parameter and call it or
        // invoke that constructor not the default constructor.
        // I you don't pass any parameters, default constructor will be called

// this shows error as Call to 'super()' must be first statement in constructor body
        //       super(20,60);

        System.out.println("Child Class Constructor");

    }

    public B(int a, int b) {
        super(a, b);

        System.out.println("Child class... Constructor with parameters");
    }

    public static void main(String[] args) {
        B obj = new B(); //this will also invoke the constructor of parent class A

        B obj1 = new B(10, 20); //this object will invoke the parameterized constructor of B
        // then super() will call parameterized constructor of Parent class A

    }
}

/*when you run this program, the output will be:

    Parent Class Constructor
    Child Class Constructor
IMPORTANT:
    BECAUSE: If we have a constructor in super class/ parent class, it will be invoked
    by every object that we construct for the child class automatically.
    There is an implicit call to super constructor.

 in case of super method , the output will be:
        Parent class Constructor with value i
        Child Class Constructor


        coz noe it will look for super constructor that matches the signature of the super()


 */
