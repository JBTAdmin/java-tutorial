import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//account class holds the details of a bank account of customers like account number, name and account balance
class Account{
    int accountNumber;
    String name;
    float AccountBalance;
    public Account(int accountNumber, String name, float AccountBalance) {
        super();
        this.accountNumber = accountNumber;
        this.name = name;
        this.AccountBalance = AccountBalance;
    }
}

//comparator class using Lambda Expressions
public class Comparatorlambda{

    public static void main(String[] args) {
        List<Account> list=new ArrayList<Account>();

        //Adding account details in list  
        list.add(new Account(00235,"Harry",25000));
        list.add(new Account(11687,"Donald",30088));
        list.add(new Account(27865,"Caristano",15078));

        System.out.println("Sorting on the basis of account name...");

        // implementing lambda expression  
        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);

        });
        System.out.println("Account Number: Account Name: Account Balance:");
        for(Account p:list){
            System.out.println(p.accountNumber+" \t\t"+p.name+" \t\t"+p.AccountBalance);
        }

    }
}  