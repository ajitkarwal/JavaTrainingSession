package finalVSfinallyVSfinalize;
/*
final methods: prevents overriding of methods
final class : prevent inheritance
 */
public class ChildClass extends ParentClass{ //now final class cannot be inherited.
    // that is why error is shown here

/*    public void start(){  // this is called method overriding. it show error here coz in the
                    //parent class method is 'final'. try running after removing /*
        System.out.println("Child Class .......... start() method");
    }
*/
}
