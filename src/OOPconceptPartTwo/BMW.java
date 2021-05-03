package OOPconceptPartTwo;

public class BMW extends Car{ // this relationship is called "has-a relationship"



    public void start(){ // this method is also it it parent class. but the preference
                            // will be given to child class method
        System.out.println("BMW starts here...");
    }

    public void theft_Safety(){
        System.out.println("BMW becomes theft Safe here...");
    }
}
