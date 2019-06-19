package a2;
public interface ClassProgram 
{
	 public static void main(String[] args) 
	 {
	    Computer my = new Computer();
	    Laptop your = new Laptop();	   
	    my.computer_method();
	    your.laptop_method();
	    Externalclass c1= new Externalclass();
	    c1.display();
	  }
}
class Computer
{
	  Computer()
	  {
	    System.out.println("Constructor of Computer class.");
	  }	 
	  void computer_method()
	  {
	    System.out.println("Power gone! Shut down your PC soon...");
	  }
}
class Laptop 
{
	  Laptop() 
	  {
	    System.out.println("Constructor of Laptop class.");
	  }
	 
	  void laptop_method() 
	  {
	    System.out.println("99% Battery available.");
	  }
}