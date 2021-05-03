package OOPconceptPartTwo;

import java.util.Calendar;

public class TestCar {
    public static void main(String[] args) {
        BMW bmw = new BMW();

        /*
        When a method is defined in child class with same name and same arguments as in
        parent class, it is called method overriding
         child class method has priority over
         */

        bmw.start(); // this is overridden method . this start() method belongs to BMW class not its parent class.
        //This is called static polymorphism or compile time polymorphism
        //why compile time polymorphism, coz at compile time java decides which method is
        //to be called



        bmw.stop();
        bmw.refill();
        bmw.theft_Safety();
        bmw.engine(); //from super class vehicle


        System.out.println("************************");
        Car c = new Car();
        c.start();//now this start method belongs to Car class.
                    // coz parent class cannot access properties of its child class
        c.start();
        c.refill();

        System.out.println("************************");

//        new BMW(); //this statement will create new BMW object in the memory without any reference


        //  Top Casting.
        Car c1 = new BMW(); //  Child Class object can be referred by parent class reference variable
        //child class object can be referred to by parent class reference variable -->
        //this is called dynamic polymorphism or run time polymorphism.

        c1.start(); // here reference variable is of parent class but as we said preference
                    //will be given to child class start() method.
        c1.stop();
        c1.refill();
/*        c1.theft_Safety(); this will give error. security issue. only common or overridden
            and parent class properties can be accessed by parent class reference variables
            this is called dynamic polymorphism or run time polymorphism.

*/
        System.out.println("************************");


/*      Down Casting. Parent Class object can be referred by Child class reference variable.

        BMW b3 = new Car();  this is not possible.
 */
        //we have to make it (OR CAST IT) BMW object
        BMW b2 = (BMW) new Car(); // this is called casting. it will give ClassCastException at run time

        // so down casting is possible but not allowed.


    }
}
