public class Bank_account
{
private String acc_holder_name;
private String acc_number;
private float balance;
private boolean open;

Bank_account(String acc_holder_name,String acc_number,float balance)
{
    this.acc_holder_name=acc_holder_name;
    this.acc_number=acc_number;
    open=true;
    this.balance=balance;
}

public void print()
{
    System.out.println("Acc Owner: "+acc_holder_name);
    System.out.println("Acc Number: "+acc_number);
    System.out.println("Acc Balance: "+balance);
    if (open) System.out.println("Acc Status: Open");
    else System.out.println("Acc Status: Closed");
}

public float get_balance()
{
  return balance;
}

public void reopen() throws IllegalStateException
{
if(open)throw new  IllegalStateException() ;
else
    open=true;
}

public void close () throws IllegalStateException,IllegalArgumentException
{
    if (!open )throw new IllegalStateException();
    if(balance!=0) throw new IllegalArgumentException();
}
public void deposit(float value) throws IllegalArgumentException
{
    if (value<=0) throw new IllegalArgumentException();
    else balance+=value;
}

public void withdraw(float value) throws IllegalArgumentException
{
   if(value<=0&&balance<value) throw new IllegalArgumentException();
   else balance-=value;
}



}
