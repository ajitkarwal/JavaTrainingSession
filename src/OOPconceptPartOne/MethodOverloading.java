package OOPconceptPartOne;
//Method OverLoading is distinguishing methods not by name but by their signature
// i.e. using their parameters/arguments  to differentiate them.
// i.e. Overloading in Java is the ability to create multiple methods of the same name,
// but with different parameters.

/* Different ways of doing overloading methods

    1.  The number of parameters in two methods.
    2.  The data types of the parameters of methods.
    3.  The Order of the parameters of methods.*/

public class MethodOverloading {

    public static void main(String[] args) {  //main() method can also be overloaded.

        MethodOverloading mo = new MethodOverloading();
        mo.sum();
        int s1 = mo.sum(4,9,7);
        System.out.println("With three params sum is : "+s1);
        int s2 = mo.sum(6,8);
        System.out.println("With two params sum is : "+s2);

    }
//Why Method Overloading is needed?
//1.    we cannot create a method inside another method
//2.    Duplicate methods are not allowed


    public void sum(){ //np param
        System.out.println("SUM  method with no params");

    }

    public int sum(int x, int y){
        System.out.println("SUM  method with two params");
        int sum = x+y;
        return sum;

    }
    public int sum(int x, int y, int z){ //tree param
        System.out.println("SUM  method with three params");

        int sum = x+y+z;
        return sum;
    }

    //main() method can also be overloaded.
    // we never overload main(), but from the knowledge point of view, it can be overloaded
    // for eg.
    public static void main(int a, int b){

    }


}



//Notes : The main advantage of Method OverLoading is cleanliness of code.
// Method overloading increases the readability of the program.
// Overloaded methods provide programmers the flexibility
// to call a similar method for different types of data.
// Overloading is also used on constructors to create
// new objects given different amounts of data.