package OOPconceptPartThree;

public class TestBank {



    public static void main(String[] args) {

        /*
        coz all the variable declared in Interface are static by nature
        we can access them only by class name or Interface name in this case.
         */
        System.out.println(USBank.min_bal);

//        USBank.min_bal = 200; // ERROR! coz it is static and final, it cannot be assigned a new value

        HSBCBank hsbcBank = new HSBCBank();

        hsbcBank.credit();
        hsbcBank.educationLoan();
        hsbcBank.transferMoney();
        hsbcBank.carLoan();
        hsbcBank.debit();
        hsbcBank.mutualFunds();

        //now we are going to achieve Dynamic Polymorphism:
        //child class object can be referred by parent Interface reference variable

        USBank usb = new HSBCBank();
        /*
        The following methods are accessible coz they are overridden methods
         */
        usb.credit();
        usb.transferMoney();
        usb.debit();


        /*
        The following methods cannot be accessed bu usb object. only overridden methods
        can be accessed by parent Interface reference variable
         usb.carLoan();
        usb.educationLoan();
         */

    }


}
