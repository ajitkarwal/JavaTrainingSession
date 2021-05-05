package JavaCollectionsFramework.ListCollectionInterface;

import java.util.Vector;

public class VectorsCollection {


    public static void main(String[] args) {
        Vector<Integer> v= new Vector<Integer>();

        System.out.println("No of elements in Vector v "+v.size());//before adding elements

        v.addElement(1);
        v.addElement(2);

        v.add(3);
        System.out.println("No of elements in Vector v "+v.size());

        Vector<Integer> vec_tor = new Vector<Integer>();
        // Use add() method to add elements in the vector
        vec_tor.add(1);
        vec_tor.add(2);
        vec_tor.add(3);
        vec_tor.add(10);
        vec_tor.add(20);

        boolean b = vec_tor.add(8); // return type of add() is boolean.
        //so if the element is added it returns true.
        System.out.println(b);
        System.out.println(vec_tor);
        // Adding new elements to the end
        vec_tor.addElement(50); // addElement() has void return type.
        vec_tor.addElement(100);

        // Printing the new vector
        System.out.println("The new Vector is: " + vec_tor);

    }
}
