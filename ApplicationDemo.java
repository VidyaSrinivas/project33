package employeeproject;
import java.util.Scanner;

public class ApplicationDemo {
	public static void main(String[] args) {
	Users u =new Users();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name");
	String name=sc.next();
	u.setName(name);
	System.out.println("Enter the employee ID");
    int empId=sc.nextInt();
    u.setEmpId(empId);
    System.out.println("Enter the qualification");
    String qualification = sc.next();
    u.setQualification(qualification);
	System.out.println("Enter the email id ");
	String emailid= sc.next();
	u.setEmailid(emailid);
	System.out.println("Enetr the employee contact number");
	String contactNumber=sc.next();
	u.setContactnumber(contactNumber);
	System.out.println("Enter the employee address");
	String address = sc.next();
	u.setAddress(address);
	System.out.println("Enter the employee date of birth");
	int dateofbirth = sc.nextInt();
	u.setDateofbirth(dateofbirth);
	System.out.println("Enter the employee status");
	String status = sc.next();
	u.setStatus(status);
	
	UsersBusinnesslogic  ub=new UsersBusinnesslogic();
	ub.registerUser(u);
	ub.ListEmployees(u);
	ub.validateUser(u);
    ub.AuthenticateUser(emailid);
	}

	
	}


