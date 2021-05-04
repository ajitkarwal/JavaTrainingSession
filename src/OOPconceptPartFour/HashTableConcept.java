package OOPconceptPartFour;

import java.util.Hashtable;

//data is stored in key value pairs.
public class HashTableConcept {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();

        ht.put("name", "Ajit");
        ht.put("age", 33);
        ht.put("sex", 'M');
        //we can also use any data type as key. any combination of data types like:
        ht.put(1, "apple");
        ht.put('A', 8);

        System.out.println(ht.size());
        System.out.println(ht.get("name"));
        System.out.println(ht); // prints in sorted form according to to key names
                                // output is {A=8, age=33, name=Ajit, sex=M, 1=apple}


        //Checking if hashtable is empty
        System.out.println("Is hashtable is empty: " + ht.isEmpty());


        //TO RESTRICT IT TO ONE DATA TYPE

        Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();// key is integer and value is string

        ht1.put(1,"Jack");
       // ht1.put(5, 700); //this will give error as 700 is not in quotes i.e. not String

    }
}
