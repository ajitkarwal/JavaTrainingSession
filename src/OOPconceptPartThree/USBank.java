package OOPconceptPartThree;

public interface USBank {

    int min_bal = 100; //static and final in nature...
    public void credit();
    public void debit();
    public void transferMoney();

    /*
    In iInterface
    1. Only the method declarations
    2. No Method Body. only method prototype
    3. we can declare variables, variables are static in nature by default
    4. and variable value will not be changed
    5. No static method in Interface
    6. no main() method
    7. We cannot create the object of Interface. Interface are abstract in nature
     */
}
