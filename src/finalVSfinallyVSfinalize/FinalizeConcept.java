package finalVSfinallyVSfinalize;

//IMPORTANT: An object become eligible for Garbage Collection if it is not used by any
// program or thread or any static references or its references is null.
//Finalize() is the method of Object class. So This method will be available in all
// objects you create in java.

public class FinalizeConcept {
    
    public void finalize(){ // we are not going to call this method. it will be called
                            //automatically. it will check which objects are available for
                            //garbage collection.
        System.out.println("finalize method");
    }

    public static void main(String[] args) {

        FinalizeConcept f1 = new FinalizeConcept();
        FinalizeConcept f2 = new FinalizeConcept();

        f1=null; //it means f1 and f2 are not referring to any object. means f1 and f2 are eligible for Garbage Collection
        f2=null; //but objects are there in the memory.

/*
Garbage Collection is the process of reclaiming the runtime unused memory
by destroying the unused objects.
 OR : garbage collection is the process of managing memory, automatically.
 It finds the unused objects (that are no longer used by the program) and delete or remove
 them to free up the memory.

 FINALIZE CONCEPT: When a garbage collector determines that no more references are made
 to a particular object, then the finalize () method is called by the garbage collector
 on that object. The finalize () method requires no parameters and does not return a value.

 When garbage collector removes object from the memory, first, the garbage collector thread
 calls the finalize() method of that object and then remove.

 finalize() method on an abandoned object is called only once by the garbage collector thread.
 GC ignores finalize() method called on an object by the developer.


 */
//WE CAN ALSO CALL GARBAGE COLLECTOR MANUALLY

        System.gc(); //garbage collector can be called manually.

        //before System.gc(), finalize() will be called to perform some cleanup processing
/*
Calling the gc method suggests that the Java Virtual Machine expend effort toward recycling
unused objects in order to make the memory they currently occupy available for reuse by
the Java Virtual Machine.
There is no guarantee that this effort will recycle any particular number of unused objects,
reclaim any particular amount of space, or complete at any particular time, if at all,
before the method returns or ever.
*/



    }//main() ends here



}

//if finalize() and gc() methods run and free up space. the output will be :
//    finalize method
//    finalize method

//printed twice, as there are two objects to be collected by garbage collector

