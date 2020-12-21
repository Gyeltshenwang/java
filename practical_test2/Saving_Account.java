 class Bank_Account
{

private String name; // instance variable
private int balance;

// public Bank_Account()  // constructor that initilize a name and balance
// {
// 	name = "gyeltshen wangdi";
// 	balance = 200;
// 	Account = 12190053;
// }

public void Setname() // set a name  as wangdi since it is private
{
	name = "wangdi";
}



public String getname() // afetr that it will get name
{
	return name;
}

public void Setbalance()// set balance science it is private 
{
	balance = 2000;
}

public int getbalance() // get balance 
{
	return balance;
}

public String toString() // convert into string type 
{
	return("name:"+name+" BALANCE:"+balance);
}


}



public class Saving_Account extends Bank_Account
{
	public static void main(String [] argument)
	{
       Saving_Account obj = new Saving_Account();

     obj.Setname();
       System.out.println(obj.getname());
       

       System.out.println(obj.getbalance());
       obj.Setbalance();

       System.out.println(obj.toString());
	}
}