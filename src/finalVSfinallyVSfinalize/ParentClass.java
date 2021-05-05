package finalVSfinallyVSfinalize;
/*
final methods: prevents overriding of methods
final class : prevent inheritance
 */

//public final class ParentClass { //now final class cannot be inherited. thats why it will
                                //show error in the child class

    public  class ParentClass {

        //making a method  final
    public final void start(){ // final keyword prevents method overriding. that is why the error is
                              //  shown coz ChildClass{} is trying to override it
        System.out.println("Parent Class .......... start() method");
    }
}
