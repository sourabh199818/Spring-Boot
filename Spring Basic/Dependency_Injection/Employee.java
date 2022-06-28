package Dependancy1.Depandancy1;

public class Employee {
	private int id; 
	private String Employeename;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String Employeename) {
		this.Employeename = Employeename;
	} 
	
	public void ShowMePlease()
	{
		System.out.println("This is the name "+Employeename+"and id"+id);
	}

}
