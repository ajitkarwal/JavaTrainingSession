package finalVSfinallyVSfinalize;

/*
Java final variable:- If you make any variable as final, you cannot change the value of final variable (It will be constant).
Once a final variable has been assigned, it always contains the same value. If a
final variable holds a reference to an object, then the state of the object may be
changed by operations on the object, but the variable will always refer to the same
object (this property of final is called non-transitivity).

final methods: prevents overriding of methods
final class : prevent inheritance
 */
public class FinalConcept {

    public static void main(String[] args) {

        final int i = 10; //final keyword is used to define the constant values.
     //   i++; // cannot assign a value to final variable
     //   i= 20; this will give an error. "cannot assign a value to final variable"

        System.out.println(i);


    }


}
