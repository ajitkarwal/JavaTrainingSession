package OOPconceptPartFive;

public class ConstructorWithThisKeyword {

    //class variables
    String name;// these values are should be initialized
    int age;


    public ConstructorWithThisKeyword() {
    }

    // only these parameter variables are initialized with "Ajit" and 30. not class variables
    public ConstructorWithThisKeyword(String name, int age) {
        this.name=name; //this keyword is used to initialize the class or local variables
        this.age=age;  // this is how compiler will know what are class variables

        //if we do not use 'this' keyword, we can use different variable names for
        String name1= name;
        int age1 = age;

        System.out.println("from parameter listing : "+name);
        System.out.println(this.name);
        System.out.println("from parameter listing : "+age);
        System.out.println(this.age);

        System.out.println("name1 : +"+name1);
        System.out.println("age1 : +"+age1);




    }

    public static void main(String[] args) {

        ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Ajit", 30);

    }
}
