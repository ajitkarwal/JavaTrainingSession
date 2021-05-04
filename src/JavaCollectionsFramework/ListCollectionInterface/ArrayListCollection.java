package JavaCollectionsFramework.ListCollectionInterface;

import OOPconceptPartFour.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {


    public static void main(String[] args) {
        ArrayList ar = new ArrayList(); //this ArrayList is RawType coz it is without any GENERICS(SEE BELOW)
        // THAT IS WHY it is highlighted. it is a warning

        ar.add(100); // index starts from zero
        ar.add(200);
        ar.add(300);
        ar.add(400);

        System.out.println(ar.size());
        ar.add(500);
        ar.add(600);

        System.out.println(ar.size());

//ANY TYPE OF DATA CAN BE STORED IN AN ARRAYLIST
        ar.add("Ajit");
        ar.add('A'); // Compiler allows any type of data in arraylist
        ar.add("Hello");
        ar.add(23.98);

        System.out.println(ar.size());

//IT CAN CONTAIN DUPLICATE VALUES
        ar.add("Ajit"); // it can store duplicate values
        System.out.println("after adding duplicate value, the size is : "+ar.size());

//TO GET THE VALUE AT A SPECIFIC INDEX
        System.out.println(ar.get(6));

//TO PRINT ALL THE VALUES IN AN ARRAYLIST. we can also use iterator

        System.out.println(ar); //by using ArrayList Name

        for(int i =0; i<ar.size();i++){ // OR by using for loop
            System.out.println(ar.get(i));

        }

//TO RESTRICT ARRAYLIST TO ONE DATA TYPE. it is done with wrapper classes
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ArrayList<String> ar2 = new ArrayList<String>();
        ArrayList<Object> ar3 = new ArrayList<Object>();

        // ar1.add("Tom"); will give you error


//TO REMOVE AN ITEM FROM ARRAYLIST
        System.out.println("size before remove method = "+ar.size());
        ar.remove(6);

        System.out.println("size after remove method = "+ar.size());


//TO GET THE INDEX OF AN ITEM IN THE ARRAYLIST
        System.out.println(ar.indexOf(600)); // index starts from 0



// TO RESET OR UPDATE AN ARRAYLIST ITEM AT A PARTICULAR INDEX
        System.out.println("before Resetting value at ar(index:6)=:"+ar.get(5));
        ar.set(5,"new Value");
        System.out.println("After Resetting value at ar(index:6)=:"+ar.get(5));


//NON-GENERIC vs GENERIC:
        /*Non-Generic:- With its type parameters omitted, ArrayList is raw type or non - generic.
         that is why it is highlighted here. it is unsafe.
        compiler allows it. But, when this data is retrieved from ArrayList,
         it causes problems at runtime for Non-generic ArrayList.*/

        /*Generic:- Generics means parameterized types.Using Generics, it is possible to
         create classes that work with different data types.
         In this case if we want to force that only one type of data should be stored in ArrayList
         we have to define generics. here we are using wrapper classes (Integer, String, Character etc)
         Note : in this case keywords are not highlighted.
         */

        ArrayList<String> al = new ArrayList<String>();
        al.add("Ajit");
        al.add("Marx");
        al.add("Glen");
        //  al.add(100); this will give an error

//What if we are not sure what type of data is generated and
// to be stored in ArrayList at runtime?
        //  ArrayList<E> al1= new ArrayList(E); // we are calling it in a static method
        // so we have change the void main() to <E> main.
        //generally we do not use it


        //STORING USER DEFINED CLASS OBJECTS IN ARRAYLIST (with generics concept)
        // this is described with the help of Employee class in this package

        //creating Employee class objects ...
        EmployeeClass e1 = new EmployeeClass("Ajit", 25, "Human Resource" );

        EmployeeClass e2 = new EmployeeClass("Naveen", 45, "QA");
        EmployeeClass e3 = new EmployeeClass("Yuvraj", 34, "Tech");
        //creating ArrayList to store Employee objects
        //i.e. this arrayList is going to store data of Employee data type.
        // so we have to define the Generics accordingly. like:

        ArrayList<EmployeeClass> al1 = new ArrayList<EmployeeClass>(); //

        al1.add(e1);
        al1.add(e2);
        al1.add(e3);

//ITERATING TO TRAVERSE THE VALUES OF ARRAYLIST

        // all the elements are stored in iterator 'it'
        Iterator<EmployeeClass> it =  al1.iterator();

        // iterator does not work on the basis indexes. so we are using while loop
        while (it.hasNext()){ //Returns true if the iteration has more elements.

            // next() will return the next element in the iterator 'it'. in this case,
            // elements are objects of Employee class. each time next() returns a new element
            //it is given to emp.
            EmployeeClass emp = it.next(); // every time 'emp' has new object of class Employee

            System.out.println("Name : "+emp.name+"     Age : "+emp.age+ "   Department : "+emp.department  );

        }//While() ends here

        //**************  OTHER IMPORTANT METHODS ********************************


        //*******     1. addALL() To store all the elements from one list to another

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ajit");
        al2.add("Marx");
        al2.add("Glen");

        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("Pushkar");
        al3.add("Aatisha");
        al3.add("Yogi");

        al2.addAll(al3); //all al3 elements will be stored in al2

        for(int i=0;i<al2.size();i++){
            System.out.println(al2.get(i));
        }
//*******     2. removeALL() To remove all the elements from an ArrayList

        System.out.println("Size of al2 list before removeAll() = "+al2.size());

        al2.removeAll(al3); //removes all al3 elements from al2
        System.out.println("Size of al3 list after removeAll() = "+al2.size());
        for(int i=0;i<al2.size();i++){
            System.out.println(al2.get(i));
        }

//*******     3. retainAll() retains all matching elements in the current
// ArrayList instance that match all elements from the Collection list
// passed as a parameter to the method.

        ArrayList<Character> ar4 = new ArrayList<Character>();
        ar4.add('A');
        ar4.add('B');
        ar4.add('C');
        ar4.add('D');

        ArrayList<Character> ar5 = new ArrayList<Character>();
        ar5.add('E');
        ar5.add('B');
        ar5.add('C');
        ar5.add('H');

        ar4.retainAll(ar5); //ar4 will keep only those elements which are also in ar5
        System.out.println("Size of al3 list after retainAll() = "+ar4.size());


        for(int i=0;i<ar4.size();i++){ // out is 'B' and 'C'. these are common in both
            System.out.println(ar4.get(i));
        }



    }
}
