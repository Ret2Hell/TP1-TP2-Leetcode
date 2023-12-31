import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        BankAccount b= new BankAccount(220011,100000,"yassine");
        System.out.println("num: "+b.getAccountNumber());
        System.out.println("name: "+b.getAccountHolderName());
        System.out.println("balance: "+b.getBalance());
        System.out.println("Donner le montant a deposer");
        int n1=S.nextInt();
        b.deposit(n1);
        System.out.println("balance: "+b.getBalance());
        System.out.println("Donner le montant a withdraw");
        int n2=S.nextInt();
        b.withdraw(n2);
        System.out.println("balance: "+b.getBalance());





    }}