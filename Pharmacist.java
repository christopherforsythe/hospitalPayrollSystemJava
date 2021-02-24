/**
 * 
 */
package polymorphismHospitalPayrollSystem;

/**
 * @author chrisforsythe
 *
 */
public class Pharmacist extends Employee {
	
	
	private int grade;
	private double bonus;
	

	/**
	 * 
	 */
	public Pharmacist() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		// TODO Auto-generated constructor stub
		this.grade = grade;
		this.bonus = bonus;
	}
	
	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2f Grade : %.2f Bonus : £%.2f", "Pharmacist", this.getFirstName(),
				this.getLastName(), this.getBaseRate(), this.grade, this.getBonus());
	}

	@Override
	public void calculateWeeklySalary(double hours) {
		// TODO Auto-generated method stub
		System.out.printf("%-10s %-10s [%-20s] : %.2fhrs * £%.2f + £%.2f = £%.2f", this.getFirstName(), this.getLastName(), "Pharmacist", hours, this.getBaseRate(),
				this.bonus, (hours * this.getBaseRate() + this.bonus));

	}

}
