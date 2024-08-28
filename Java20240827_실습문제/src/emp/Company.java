package emp;

public class Company {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[2];
		emp[0] = new Secretary("Duke" ,1 , "Secretary" , 800);
		emp[1] = new Sales("Tuxi" , 2 ,"Sales",1200);
		
		PrintTitle(false);
		printEmployee(emp, false);
		
	   
		((Secretary)emp[0]).incentive(100);
		((Sales)emp[1]).incentive(100);
		
		PrintTitle(true);
		printEmployee(emp, true);
	}

	public static void printEmployee(Employee[] emp, boolean isTax) 
	{ 
		for(int i = 0 ; i < emp.length ; ++i)
		{
			if(isTax)
			{
				if(emp[i] instanceof Sales)
				{
				    System.out.println
				    (emp[i].name + "\t" + emp[i].department + "  \t  " + emp[i].salary + "\t" +emp[i].tax()+"  \t "  +((Sales)emp[i]).getExtraPay()+ " \t ");
				}
				else
				{
				    System.out.println
				    (emp[i].name + " " + emp[i].department + "    " + emp[i].salary + "  \t   " + emp[i].tax() + "  \t " );
				}
			}
			else
			{
				if(emp[i] instanceof Sales)
				{
				    System.out.println
				    (emp[i].name + "    " + emp[i].department + "       " + emp[i].salary+"   " +((Sales)emp[i]).getExtraPay()+ "    ");
				}
				else
				{
				    System.out.println
				    (emp[i].name + "   " + emp[i].department + "     " + emp[i].salary + "  \t ");
				}
			}
			
		}
	}
	
	public static void PrintTitle(boolean istrue) {
		if(istrue)
		{
			System.out.println("name   department  salary   tax   extrapay");
			System.out.println("----------------------------------------");
		}
		else {
			System.out.println("name   department  salary  extrapay");
			System.out.println("----------------------------------------");
		}
	
	}
}
