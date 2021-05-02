package OOPconceptPartOne;

public class Cars {

    //class variable
    int modelNo;
    int wheel;
    public static void main(String[] args) {

        Cars a = new Cars();    // here new Cars() is object and a is object reference
        Cars b = new Cars();    //'new' keyword is used to create the new object
        Cars c = new Cars();    // a, b and c are object reference variables

        //copy of modelNo and wheel iss given to each object. which can be accessed with object reference
        a.modelNo = 2015;
        a.wheel= 4;
        b.modelNo= 2014;
        b.wheel = 4;
        c.modelNo = 2013;
        c.wheel = 4;

        System.out.println("object reference a "+ a.modelNo);
        System.out.println("object reference a "+ a.wheel);
        System.out.println("object reference b "+ b.modelNo);
        System.out.println("object reference b "+ b.wheel);
        System.out.println("object reference c "+ c.modelNo);
        System.out.println("object reference c "+ c.wheel);

        // I have already said tha a, b, c are just object references not objects

        // lets take an example. we know that we can
        a=b;
        b=c;
        c=a;

//now a and c are referring to same object creating the conflict
// if both try to change the properties of same object

        a.modelNo = 10;
        System.out.println("a changed the model to :"+a.modelNo);
        c.modelNo =20;
        System.out.println("c changed the model to :"+c.modelNo);


        System.out.println("After change............");
        //this means the object initially referred to by a is no longer accessible.
        //this shows that a, b and c are merely object references not actual objects
        System.out.println("object reference a "+ a.modelNo);
        System.out.println("object reference a "+ a.wheel);
        System.out.println("object reference b "+ b.modelNo);
        System.out.println("object reference b "+ b.wheel);
        System.out.println("object reference c "+ c.modelNo);
        System.out.println("object reference c "+ c.wheel);


    }
}
