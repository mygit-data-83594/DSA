import java.util.Arrays;
import java.util.Scanner;

class Employee{
	private int empid;
	private double salary;
	private String name;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int empid, double salary, String name) {
		this.empid = empid;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", name=" + name + "]";
	}
	
	public Employee() {

	}
	
	public void acceptEmployee(Scanner sc){
		System.out.println("Enter A employee ID :");
		empid=sc.nextInt();
		System.out.println("Enter A employee Name :");
		name=sc.next();
		System.out.println("Enter A employee Salary :");
		salary=sc.nextDouble();
	}
}




public class QuestionNo3 {
	public static void sortBySalary(Employee arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].getSalary()>arr[j].getSalary()) {
					Employee temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
public static void main(String[] args) {
	//. Write a function to sort employees by their salary
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of employee Your company contain :");
	int size=sc.nextInt();
	Employee arr[] = new Employee[size];
	for(int i=0;i<size;i++) {
		arr[i]=new Employee();
		arr[i].acceptEmployee(sc);
	}
	
//	for (Employee employee : arr) {
//		System.out.println(employee.toString());
//	}
	
	sortBySalary(arr);
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i].toString());
}
}
}
