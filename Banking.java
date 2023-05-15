//Banking.java
package bb;
import java.util.Scanner;
import iee.InvalidEntryException;
import ism.InsuffientAmountException;
import iie.InvalidInputException;
public class Banking 
{
int amount;
Scanner s=new Scanner(System.in);
int balance;

  public Banking()
{
	balance=500;
}

public void deposit() throws NumberFormatException, InvalidEntryException
{
    System.out.println("Enter the amount to deposit");
     amount=Integer.parseInt(s.nextLine());
    if(amount<=0){
	InvalidEntryException ie=new InvalidEntryException();
    throw ie;
}else{
	balance=amount+balance;
    System.out.println(amount+ "  is deposited in account");
    System.out.println("Balance after deposition="+balance);
}
}
public void withdraw() throws NumberFormatException, InsuffientAmountException, InvalidInputException
{
    System.out.println("Enter amount to withdraw");
    int withDraw=Integer.parseInt(s.nextLine());
	if(withDraw<=0)
{
	InvalidInputException ii=new InvalidInputException();
     throw ii;
}
if((withDraw+500)>balance)
{
     InsuffientAmountException ia=new InsuffientAmountException();
     throw ia;
	
}else{
      if(withDraw<balance)
      {
	 balance=balance-withDraw;
    System.out.println(withDraw+ "  is with drawn from account");
    System.out.println("Balance after withdraw= "+balance);
}
}
}
 
public void balanceEnquiry() 
{
	System.out.println("----------------------------------------------");
    System.out.println("Your Account Current Balance ="+balance);
	System.out.println("----------------------------------------------");

}
}


