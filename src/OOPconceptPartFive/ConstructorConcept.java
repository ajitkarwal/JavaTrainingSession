package OOPconceptPartFive;

/*
1. A constructor is nothing but automatic initialization of the object.
2. The name of the constructor is same as the class name and it has no return type.
3. Constructor is not a function or method.
4. if we do not define any constructors, there always a hidden constructor called default constructor.
5. If you don’t write your own constructor then compiler supplies you with the default constructor.
6. Whenever the program creates an object at that time constructor is gets called automatically.
7. At the time of object creation, constructors are used to initializing the values of class variables to either default or the desired ones.
8. it is good practice to to create default constructor.

 */
public class ConstructorConcept {


    public ConstructorConcept() { // no parameters
        System.out.println("default constructor");
    }

    public ConstructorConcept(int i) {//parameterized constructor
        System.out.println("one parameter constructor");
        System.out.println(i);
    }

    public ConstructorConcept(int i, int j) {//parameterized constructor
        System.out.println("two parameter constructor");
        System.out.println(i);
        System.out.println(j);
// we have three constructors. this is called constructor overloading.
    }

    public static void main(String[] args) {

        //The moment you instantiate an object, constructor is called
        ConstructorConcept obj = new ConstructorConcept();//default constructor is called
        ConstructorConcept obj1 = new ConstructorConcept(10);//one parameter constructor is called
        ConstructorConcept obj2 = new ConstructorConcept(10, 20);//two parameter constructor is called


    }
}
/* ********** Output*********

default constructor
        one parameter constructor
        10
        two parameter constructor
        10
        20
 */
