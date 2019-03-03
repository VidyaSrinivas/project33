package employeeproject;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsersBusinnesslogic implements UserBusiness {

	@Override
	public boolean registerUser(Users u) {
	if(	validateUser(u))
		System.out.println("user registred to successfully");
	else
		System.out.println("user registred to successfully");
		return false;
	}

	boolean validateUser(Users u) {
		Users ub=new Users();
		Scanner sc=new Scanner(System.in);
		 String empName= "^[a-zA-Z]\\s[a-zA-Z]+$";   
	        String name;
	   
	        do {
	            System.out.print("Enter your Name:");
	            name= sc.next();
	            u.getName();
	            if (name.matches(empName))
	                System.out.println("Employee name:"+name); 
	            else if (name.isEmpty())
		                System.out.println("String field should not be Empty.");
	            else if(!name.matches(empName))
	            System.out.println("Please Enter A Valid String");
	            System.out.println("Enter again the valid name");
	            name= sc.next(); 
	        } while(!name.matches(empName));
	        
	        
	        //validate of the date of birth
	        String dob= "MM/dd/yyyy";   
		    String dateofbirth;
		  
		       do {
		           System.out.print("Enter the date of birth");
		         dateofbirth= sc.nextLine();
		         u.getDateofbirth();
		           if (dateofbirth.matches(dob))
		               System.out.println("Done");
		           else if (dateofbirth.isEmpty())
		               System.out.println("String field should not be Empty.");
		           else if(!dateofbirth.matches(dob))
		           System.out.println("Please Enter A Valid String!");
		       } while(!dateofbirth.matches(dob));
		       
		       //validation of address
		       String Address= "^[a-zA-Z0-9]+$";   
			    String address;
			  
			       do {
			           System.out.print("Enter the address");
			         address= sc.nextLine();
			           //u.getAddress();

			           if (address.matches(Address))
			               System.out.println("Done");
			           else if (Address.isEmpty())
			               System.out.println("String field should not be Empty.");
			           else if(!address.matches(Address))
			           System.out.println("Please Enter A Valid String!");
			       } while(!address.matches(Address));

		return false;
	}

	@Override
	public boolean updateUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Users[] SearchBySkills() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean AuthenticateUser(String emailid) {
		Pattern P1 = Pattern.compile("(^[a-z1-9]*)\\ @([a-z]*)\\.([a-zA-Z]*)");
		Matcher m1 =P1.matcher(emailid);
			if(m1.find()) { 
				return true;
			}
			else
		return false;
	
	
}
	@Override
	public void ListEmployees(Users u) {
	System.out.println("Emp Id:"+u.getEmpId());
	System.out.println("Emp Name:"+u.getName());
	System.out.println("Employee dateof birth"+u.getDateofbirth());
	System.out.println("Employee Address"+u.getAddress());
	System.out.println("Emp email"+u.getEmailid());
	
	}

	
	

}
