
public class Main
{
	public static void main(String[] args) {
	    
	   // Quiz 1
		System.out.println("Try programiz.pro");
        
        Person student1 = new Person("Elaijah", 20, "Japan");
        Person student2 = new Person("Ryze", 100,"Noxus");
        
        System.out.println(student1.getName());
        System.out.println(student2.introduce());
        
        student1.setName("Pantheon");
        System.out.println(student1.getName());
        
       // Quiz 2
       BankAccount account1 = new BankAccount("1234", 1000);
       System.out.println(account1.getBalance());
       account1.setBalance(3000);
       System.out.println(account1.getBalance());
       
       //Quiz 3
       Rectangle rectangle1 = new Rectangle(90, 30);
       System.out.println(rectangle1.getLength());
       rectangle1.setLength(120);
       System.out.println(rectangle1.getLength());
       
       // Quiz 4
       Employee employee1 = new Employee("6745", "Elaijah", 10000);
       System.out.println(employee1.getSalary());
       
       Employee employee2 = new Employee("1216", "Jerome", 9910);
       System.out.println(employee2.getSalary());
       
       
	}
}

            
