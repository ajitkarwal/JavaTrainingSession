package OOPconceptPartOne;

//global : the scope of global variable is that it is available across all the function with some conditions
// like if they are non static you have to create objects to access them.

public class Static_And_NonStatic {

    String name = "Ajit"; //non-static global variable
    static int age = 25; // static global variable


    public static void main(String[] args) {

        //calling static methods and variables

        //Variables

        System.out.println(age); // age is static so we can access it just by name i.e. direct call
        System.out.println(Static_And_NonStatic.age); // or by class name
        // System.out.println(name); //this will give error. coz its non-static variable

        //Static Methods
        // 1. direct calling

        sum();
        // 2. calling by class name
        Static_And_NonStatic.sum();

        // separate memory is allotted to static variables and methods and object have access to
        //to this memory.
        //when an object is created it is given a copy of all non static stuff
        // i.e. non static vars and methods. they become part of object. but not the static stuff
        // that's why object is needed to access non static stuff. coz they are part of object
        Static_And_NonStatic obj = new Static_And_NonStatic();
        System.out.println(obj.name);


        // can i access static methods by using object reference?
        //yes, I can. but it will give you warning. that it should be accesses in a static way.
        //static way means either call directly or by using class name.
        obj.sum();

        // they are freely available in memory. so no need to create an object reference.
        //so it is not good practice to access static methods using object reference.


    }

    public void sendMail() {            // non-static method
        System.out.println("Send Mail Method");

    }
    public static void sum(){ //static method
        System.out.println("Sum Method");
    }
}
