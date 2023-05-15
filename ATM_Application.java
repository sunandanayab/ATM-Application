//ATM_Application.java
import java.util.Scanner;
import bm.BankingMenu;
import bb.Banking;
import iee.InvalidEntryException;
import ism.InsuffientAmountException;
import iie.InvalidInputException;
class ATM_Application 
{
	public static void main(String[] args) 
	{
     Banking bo=new Banking();
     Scanner s=new Scanner(System.in);
     while(true)
     {
     try
     {
		BankingMenu.menu();
        int choice=Integer.parseInt(s.nextLine());
        switch(choice)
        {
			case 1:try
			{               
				bo.deposit();
			}catch(NumberFormatException nfe)
            {
                System.out.println("----------------------------------------------------");
				System.out.println("Cannot deposit String, alpha_numeric_value, bools, floats etc");
                System.out.println("Enter numerical values");
                System.out.println("----------------------------------------------------");

            }
			catch (InvalidEntryException ee)
			{
              System.out.println("----------------------------------------------------");
              System.out.println("\tCannot deposit negative amount");
              System.out.println("----------------------------------------------------");
			}
            break ;
            case 2:try
            {
				bo.withdraw();
            }catch(NumberFormatException nfe)
            {
                System.out.println("----------------------------------------------------");
				System.out.println("Cannot deposit String, alpha_numeric_value, bools, floats etc");
                System.out.println("Enter numerical values");
                System.out.println("----------------------------------------------------");            }
            catch (InsuffientAmountException aa)
            {
               System.out.println("----------------------------------------------------");
               System.out.println("Insiffucient amount cannot be withdrawn");
               System.out.println("----------------------------------------------------");

            }catch(InvalidInputException bb)
            {
                System.out.println("----------------------------------------------------");
      			System.out.println("Cannot withdraw negative amount");
                System.out.println("----------------------------------------------------");
            }
            break;
            case 3:bo.balanceEnquiry();
            break;
            case 4:System.out.println("------------------------------------------------");
                    System.out.println("Thanks for using ATM Application. Good Bye :)");
                    System.out.println("------------------------------------------------");
                    System.exit(0);
            break; 
            default: 
                    System.out.println("------------------------------------------------");
                    System.out.println("Your Selection is wrong");
                    System.out.println("------------------------------------------------");
        }
     }
     catch (NumberFormatException nfe)
     {
      System.out.println("Enter only positive numbers");
     }
     }
	}
     
}
