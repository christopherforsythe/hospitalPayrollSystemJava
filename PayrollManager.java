/**
 * 
 */
package polymorphismHospitalPayrollSystem;


/**
 * @author chrisforsythe
 *
 */
public class PayrollManager {

	/**
	 * @param args
	 */
	
	public static final int HOURS_PER_WEEK = 35;

	//array to hold employees
	public static Employee[] employees = new Employee[6];
	
	public static void main(String[] args) {
		
		Porter porter1 = new Porter("Paul", "Potts", 9.30, "royal");
		Porter porter2 = new Porter("Sue", "Soap", 9.15, "city");
		Surgeon surgeon1 = new Surgeon("Jack", "Ripper", 35.00, "heart", 150.00);
		Surgeon surgeon2 = new Surgeon("Andy", "Murray", 30.00, "Brain", 200.00);
		Pharmacist pharmacist1 = new Pharmacist("Polly", "Pills", 20.00, 4, 105.00);
		Pharmacist pharmacist2 = new Pharmacist("Mark", "Manz", 21.00, 3, 120.00);
		
		addEmployeeToList(porter1);
		addEmployeeToList(porter2);
		addEmployeeToList(surgeon1);
		addEmployeeToList(surgeon2);
		addEmployeeToList(pharmacist1);
		addEmployeeToList(pharmacist2);
		
		
		//display all employees
		displayAllEmployees();
		
		
		//process payroll
		processWeeklyPayroll();
		
	}
	
	/**
	 * methods to add employees to the array
	 * @param employee
	 */
	public static void addEmployeeToList(Employee employee) {
		
		for (int loop = 0; loop < employees.length; loop++) {
			
			//if the loop element is empty add to array
			if(employees[loop] == null) {
				employees[loop] = employee;
				break;
			}
		}
	}
	
	
	/**
	 * 
	 */
	public static void displayAllEmployees() {
		System.out.println("Displaying all employees _______________________");
		
		System.out.printf("[%-10s] %-20s %-20s %-6s %s \n",
				"Type", "First Name", "Last Name", "Rate", "Other",
				"Consultation Fee");
		
		for (Employee employee : employees) {
			//check if there is an employee there
			if(employee!=null) {
				employee.printAll();
				System.out.println(); //line break
			} else {
				break;
			}
		}
		
		System.out.println("________________________________________________");
	}

	
	public static void processWeeklyPayroll() {
		
		System.out.println("\nProcessing weekly payroll _______________________");
		
		for (Employee e : employees) {
			//check if array index not null
			if (e != null) {
				e.calculateWeeklySalary(HOURS_PER_WEEK);
				System.out.println(); // LINE BREAK
			}
		}
		System.out.println("\n_______________________________________________");
	}
}
