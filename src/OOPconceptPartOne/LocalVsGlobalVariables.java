package OOPconceptPartOne;

public class LocalVsGlobalVariables {

    //Global or class variables. scope is throughout the class
    String name = "Tom";
    int age = 25;


    public static void main(String[] args) {

        int i = 10; // local variable. can be used without creating the object of the class
        System.out.println(i);//can be accessed inside the same method in which it is declared


        //  System.out.println(name); this statement will throw an error.
        //so we must create a object reference to the new class object to access this variable

        LocalVsGlobalVariables ob = new LocalVsGlobalVariables();

        System.out.println(ob.name);
        System.out.println(ob.age);



    }
    public void sum(){

        System.out.println();
        int i=20;   // this 'i' variable is different from the 'i' variable declared in main()
        int j = 26;
        int age = 25;
    }
}
