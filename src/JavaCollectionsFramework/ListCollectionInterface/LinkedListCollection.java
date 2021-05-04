package JavaCollectionsFramework.ListCollectionInterface;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>(); // by defining generics using wrapper classes (Integer, String, Character etc)
//add() METHOD:
        ll.add("Test");
        ll.add("QTP");
        ll.add("Selenium");
        ll.add("Cucumber");
        ll.add("Junit");
        System.out.println(ll);
//addFirst() and addLast()
        ll.addFirst("Ajit");// added before "Test"
        ll.addLast("Jugnu");//added after "Junit"
        System.out.println(ll);

//get()
        System.out.println(ll.get(2));// gives the value stored at index 2(0,1,2)

//set() add new value at a specific index

        ll.set(0,"Paul");// will add "Paul" at 0 index
        System.out.println(ll);

 //removeFirst(), removeLast(), remove(index value)

        ll.removeFirst();// removes first value "Paul"
        ll.removeLast();//removes last value "Jugnu"

        System.out.println(ll); // output = [Test, QTP, Selenium, Cucumber, Junit]

        ll.remove(2); // will remove item at index 2 "Selenium"
        System.out.println(ll);

//HOW TO ITERATE THE LINKED LIST
        //1. For loop

        System.out.println("Using For loop");
        for(int i=0;i< ll.size();i++){
            System.out.println(ll.get(i));
        }

        //2. Advanced For Loop
        System.out.println("Using Advanced For loop");

        //'for each'     loop
        for(String str: ll){// this means whatever strings are available in ll,
                                    // iterate them, and assign one by one to str
            System.out.println(str);
        }


        //using iterator

        System.out.println("*******  Using iterator  ************");

        Iterator<String> it = ll.iterator();
        while (it.hasNext()){
           // String str = (String) it.next();
          //  System.out.println(str); OR
            System.out.println(it.next());

        }

        //While loop
        System.out.println("*******  Using While loop  ************");

        int num = 0;
        while(ll.size()>num){
            System.out.println(ll.get(num));
            num++;
        }







    }
}
