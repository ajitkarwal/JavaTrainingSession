package OOPconceptPartThree;


/*
if class is implementing any interface,
then it is mandatory to define/Override all the methods in Interface
 */
public class HSBCBank implements USBank, BrazilBank{ // multiple inheritance achieved
    // this is called "is-a relationship"


    public void credit(){
        System.out.println("HSBC.....Credit Facility");
    }
    public void debit(){
        System.out.println("HSBC.....Debit Facility");
    }
    public void transferMoney(){
        System.out.println("HSBC.......Money Transfer Facility");
    }
    public void educationLoan(){
        System.out.println("HSBC.......Education Loan Facility");
    }
    public void carLoan(){
        System.out.println("HSBC.......Car Loan Facility");
    }

    @Override
    public void mutualFunds() {
        System.out.println("Brazil Bank......Mutual Funds");

    }
}
