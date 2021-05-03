package OOPconceptPartFour;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[] args) {

        ArrayList ar = new ArrayList();  // index starts from zero

        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);

        System.out.println(ar.size());
        ar.add(500);
        ar.add(600);

        System.out.println(ar.size());

        ar.add("Ajit");  // any type of data can be stored into an array list.
        ar.add('A');
        ar.add("Hello");
        ar.add(23.98);
        System.out.println(ar.size());
        System.out.println(ar.get(6)); // to get the value at a specific index

        System.out.println(ar); // prints all the values in a row. we can also use for loop

        for(int i =0; i<ar.size();i++){
            System.out.println(ar.get(i));

        }

        //to restrict ArrayList to one data type
        // with wrapper class

        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ArrayList<String> ar2 = new ArrayList<String>();
        ArrayList<Object> ar3 = new ArrayList<Object>();


 //       ar1.add("Tom"); will give you error


        //TO REMOVE AN ITEM FROM ARRAYLIST
        System.out.println("size before remove method = "+ar.size());
        ar.remove(6);

        System.out.println("size after remove method = "+ar.size());





    }
}
