//this is the second commit in my program 
// CLASS EXAMPLE INITIALIZE THROUGH METHOD 

  /*class Student
{
	int r;
	String name;
	void insertrecord(int roll , String Name)
	{  
		r = roll;
		name = Name;
	}
	void display()
	{
		System.out.println("Student Roll no is :" + r + "\nStudent Name is : " + name);
	}

}
class test{
public static void main(String args[])
	{ 

	  Student s1 = new Student();
	  Student s2 = new Student();
	  s1.insertrecord(1 , "Ashu");
	  s1.display();
	  s2.insertrecord(2 , "Ashutosh");
	  s2.display();	

	}}*/

	//FINAL EXAMPLE OF CLASS 

/*	class Rectangle
	{
		int l;
		int b;
		void rectangle(int length , int breadth)
		{
			l=length;
			b=breadth;
		}
		void area()
		{
			System.out.println("The area is : " + (l*b));
		}
	}
	class area
	{
		public static void main(String args[])
		{
			Rectangle r1 = new Rectangle();
			r1.rectangle(4 , 5);
			r1.area();
		}
	}
*/
	// Real World Example Of Class 
	/*class Account
	{
		int account;
		String name;
		float amount;
		void insert(int a , String n , float am)
		{
			account = a;
			name = n;
			amount = am;

		}

		void deposit(float am)
		{
			amount = amount + am;
			System.out.println(am + "Deposited");

		}
		void withdraw(float am)
		{
			if(am>amount)
			{
				System.out.println("Insufficient Balance");
			}
			else
			{
				amount = amount - am;
				System.out.println("amount withdrawn of Rs: " + am );
			}
		}
		void checkbalance()
		{
			System.out.println("Available Balance Is :" + amount);
		}
		void display()
		{
			System.out.println(account +" " + name + " " + amount);
		}
	}
	class test
	{
          public static void main(String[] args)
        	{
         	   Account a1 = new Account();
         	   a1.insert(2345 , "Ashutosh" , 30000);
         	   a1.display();
         	   a1.deposit(2000);
         	    a1.checkbalance();
         	    a1.withdraw(2000);
         	     a1.checkbalance();
         	     a1.display();
         	}
	} */

	/*class School
	{
		String name;
		int roll_no;
		static String college = "ITS";
		School(String n , int r)
		{
			name = n;
			roll_no = r;
		}
		void display()
		{
			System.out.println(name + roll_no + college);
		}

	}
	class test
	{
		public static void main(String args[])
		{
		   School s1 = new School("Ashu" , 23);
		   s1.display();
		}
	}
	*/

/*	class student
	{
      int roll;
      String name,course;
      float fee;
      student(int roll, String name, String course )
       {
       	this.roll= roll;
       	this.name= name;
       	this.course=course;
		}
	 student(int roll, String name, String course, float fee)
	 {
	 	this(roll, name, course);
	 	this.fee = fee;
	 } 
	 void display()
	 {
	 	System.out.println(roll+ " "+ name+ " "+ course+ " "+ fee);
	 }
	}
	class test{
		public static void main(String args[])
		{
			student s1 = new student(24, "Ashu", "CSE" );
			student s2 = new student(24 , "Ashu", "CSE", 40000);
			s1.display();
			s2.display();
}
}*/
   
       // Inheritances and Agregation
/*
public class Emp
{
	int id;
	String name;
	Address address;
}
 public Emp(int id, String name, Address address)
 {
 	this.id=id;
 	this.name= name;
 	this.address= address;
 }
 void display()
{
  System.out.println("Student id is : " + id + " " + "\nStudent name is :" + name);
  System.out.println(address.city + " " + address.state + " " + address.country);
}
public class test_aggregation
{
	public static void main(String args[])
	{
		Address a1 = new Address("pune" + "Maharastra" + "India");
		Emp e1 = new emp(123 , "Ashutosh " , a1);
		e1.display();
	}
}
class Address {
String city,state,country;

public Address(String city, String state, String country) {
	this.city = city;
	this.state = state;
	this.country = country;
}

}*/


public class Emp {
int id;
String name;
Address address;

public Emp(int id, String name,Address address) {
	this.id = id;
	this.name = name;
	this.address=address;
}

void display(){
System.out.println(id+" "+name);
System.out.println(address.city+" "+address.state+" "+address.country);
}

public static void main(String[] args) {
Address address1=new Address("gzb","UP","india");
Address address2=new Address("gno","UP","india");

Emp e=new Emp(111,"varun",address1);
Emp e2=new Emp(112,"arun",address2);
	
e.display();
e2.display();
	
}
}
