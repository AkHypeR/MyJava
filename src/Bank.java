public class Bank {
    private int customerAccNumber;
    private String customerName;
    private Double Balance;
    private
    String Email;
    public Bank(int customerAccNumber,String customerName,Double Balance,String Email){
        this.customerAccNumber=customerAccNumber;
        this.customerName=customerName;
        this.Balance=Balance;
        this.Email=Email;
    }
    public void deposite(double depositeAmount){
        this.Balance+=depositeAmount;
        System.out.println("your avaible balance is =>"+this.Balance);
    }
    public void withdraw(double withdrawAmount){
        if((this.Balance-withdrawAmount)<0){
            System.out.println("your avaible balance is =>"+this.Balance+" you cant withdraw money");
            System.out.println("plz Add "+(withdrawAmount-this.Balance)+" money");
        }
        else {
            this.Balance-=withdrawAmount;
            System.out.println("your avaible balance is =>"+this.Balance);
        }
    }

    public void setBalance(Double balance) {
        this.Balance = balance;
    }

    public void setCustomerAccNumber(int customerAccNumber) {

        this.customerAccNumber = customerAccNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Double getBalance() {
        return Balance;
    }

    public int getCustomerAccNumber() {
        return customerAccNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return Email;
    }
}
