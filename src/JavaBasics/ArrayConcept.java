package JavaBasics;

public class ArrayConcept {
    public static void main(String[] args) {
        // Array : to similar type of data. or data with same data type.

        //disadvantages:
        //1. size is fixed. To overcome this we use collections like ArrayList, Hashtable, (these are called dynamic arrays)
        //2. stores only single data type values. This is overcome by Object array.
        //int array

        int i[]=new int[4];  // 0,1,2,3

        i[0]=4;
        i[1]=5;
        i[2]=7;
        i[3]=8;
        System.out.println("The size of array is : "+i.length);
        for (int j=0;j<i.length;j++){
            System.out.println("Value of " +j+"th element is "+i[j]);
        }
//Object is a supper class of all the classes
        //it can be used to store different types of values
    Object object[] = new Object[5];

        object[0]="Tom";
        object[1]= 25;
        object[2] = 'M';
        object[3] = 5.8;
        object[4] = "1/1/1980";


        for (int j=0;j<object.length;j++){
            System.out.println("Value of " +j+"th element is "+object[j]);
        }


    }
}
