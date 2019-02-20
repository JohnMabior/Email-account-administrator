
import java.util.Scanner;

public class Email {

	//states
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxCapacity= 500;
	private int defaultPasswordLength = 10;
	private String alternativeEmail ;
	private String companySuffix = "anycompany.com";
	
	
public Email(String firstname, String lastname)
	
	{
		this.firstname = firstname;
		this.lastname = lastname;
	
System.out.println("EMAIL CREATED:" + this.firstname + " " + this.lastname);

//call a method asking for department
this.department = setDepartment();
System.out.println("Department:" + this.department);



//call a method that returns a random password
this.password = randomPassword(defaultPasswordLength);


System.out.println("your password is :" + this.password);

Object firstName = null;
Object lastName = null;
//combine elements to generate email
Object email = firstName + "." + lastName + "@" + department + companySuffix;
System.out.println("your email is :" + email);

	}

	//constructing to contain first and last name
	
	//ask for the department
	

private String setDepartment()
{
System.out.println(	"DEPARTMENT CODES:\n1 Enter the department\1 for sales\n 2 for development\n3 for  aconting \n0 for none");
Scanner in = new Scanner(System.in);
int depChoice = in.nextInt();

if(depChoice == 1)
{return "sales";
}
else if (depChoice == 2)
	{return "dev";}
else if (depChoice == 3)
	{return "acc";}
else
	{return " ";}


}
	//generate random password
	
private String randomPassword(int length)
{
String passwordSet = "ABCDEFGHIJKLMNOPQRSTUMXY123456789!&^";
char [] password = new char [length];

for (int i = 0 ; i < length; i++)
{
int rand = (int) (Math.random() * passwordSet.length());
password[i] = passwordSet.charAt(rand);


}

return new String (password);

 
}
//set mailbox capacity
public void setMailboxCapacity(int capacity)
{
this.mailboxCapacity = capacity;	
}

	//set alternate email
	
	public void setAlternativeEmail(String altEmail)
	{
		this.alternativeEmail = altEmail;
	}
	//change the password
	public void changePassword(String password)
	{
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	
	public String getAlternativeEmail() {
		return alternativeEmail;
	}
	public String getpassword()
	{return password;}
	
	public String showifo()
	{
		return "DISPLAY NAME:"+ firstname + " " +lastname +
				"company email:" + alternativeEmail + "mailbox capacity" + mailboxCapacity + "mb";
	}
}
