package OOPconceptPartOne;

public class CallByValueAndReference {

    int p;
    int q;
    public static void main(String[] args) {
        int a= 10;
        int b=20;
        CallByValueAndReference obj = new CallByValueAndReference();

        obj.testSum(a,b); //Call by Value or Pass by Value. the copy of a nd b is given not actual copy

        obj.p = 5; // these are non static so will be accessed by object reference
        obj.q = 6;

        System.out.println("p= "+obj.p+" and q is "+ obj.q);


        obj.swap(obj); // in swap method it is getting reference so we have to pass reference here too.
        // obj will be given to t. thus t=obj. now one object have two references t and obj.

        System.out.println("p= "+obj.p+" and q is "+ obj.q);
        // swapping is done. an example of pass by reference is. by object reference


    }


    public int testSum(int x, int y){
         x =30;
         y=40;  // this change wont affect a and b as we are making changes in photocopy
                // not original copy
        int z=x+y;  //z = 70.
        return z;

    }

    public void swap(CallByValueAndReference t){ // passing the reference variable of class.
                                                // t is class reference
        int temp = t.p;
        t.p = t.q;
        t.q = temp;

    }
}
