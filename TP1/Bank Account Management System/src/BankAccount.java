
public class BankAccount {

    private int accountNumber,balance;
    private String accountHolderName;

    BankAccount(int accountNumber,int balance,String accountHolderName)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.accountHolderName=accountHolderName;
    }
    public int getAccountNumber()
    {
        return(accountNumber);
    }
    public String getAccountHolderName()
    {
        return(accountHolderName);
    }
    public int getBalance()
    {
        return(balance);
    }
    public void deposit(int x)
    {
        balance+=x;
    }
    public void withdraw(int x)
    {
        if (balance>=x)
        {balance-=x;}
        else
        {System.out.println("insufficient balance");}
    }
}

