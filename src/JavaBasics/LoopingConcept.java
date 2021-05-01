package JavaBasics;

public class LoopingConcept {
//Loop: to execute a block of code repeatedly as long as a Boolean condition is true
    // three parts any loop are:
    // 1.initialization
    // 2. Test Expression
    // 3. Update Expression

    public static void main(String[] args) {
    //1. While Loop:


        int i = 1;          // initialization
        while(i<=10){       //Test Expression : i<=10
            System.out.println(i);
            i=i+1;          //Update Expression : i=i+1
        }
        //disadvantage is if there is no update expression then the value of i always remains <10.
        //the the loop will keep running infinitely


    //2. For Loop:
        for (int j =1; j<=10; j++){  // ; is used coz there are three separate statements in there
            System.out.println(j);

        }

    }
}
