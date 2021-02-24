/**
 * 
 */
package polymorphismHospitalPayrollSystem;


/**
 * @author chrisforsythe
 *
 */
public class Porter extends Employee {
	
	private String site;

	/**
	 * 
	 */
	public Porter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		// TODO Auto-generated constructor stub
		this.site = site;
	}
	
	
	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2f Site : %s", "Porter", this.getFirstName(), this.getLastName(), this.getBaseRate(),
				this.site);
	}
	
	
	@Override
	public void calculateWeeklySalary(double hours) {
		
		System.out.printf("%-10s %-10s [%-20s] : £%.2hrs * £%.2f = £%.2f ", this.getFirstName(),
				this.getLastName(), "Porter", hours, this.getBaseRate(),
				(hours * this.getBaseRate()));
	}

}
