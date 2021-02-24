/**
 * 
 */
package polymorphismHospitalPayrollSystem;

/**
 * @author chrisforsythe
 *
 */
public class Surgeon extends Employee {
	
	//instance vars
	private String specialistArea;
	private double consultationFee;

	/**
	 * 
	 */
	public Surgeon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		// TODO Auto-generated constructor stub
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
		
	}

	/**
	 * @return the specialistArea
	 */
	public String getSpecialistArea() {
		return specialistArea;
	}

	/**
	 * @param specialistArea the specialistArea to set
	 */
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}

	/**
	 * @return the consultationFee
	 */
	public double getConsultationFee() {
		return consultationFee;
	}

	/**
	 * @param consultationFee the consultationFee to set
	 */
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	
	
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2f Specialist Area : %-20s Consultation fee : £%.2f", "Surgeon",
				this.getFirstName(), this.getLastName(), this.getBaseRate(), this.specialistArea, this.consultationFee);
	}

	@Override
	public void calculateWeeklySalary(double hours) {
		
		System.out.printf("%-10s %-10s [%-20s] : %.2fhrs * £%.2f + £%.2f = £%.2f", this.getFirstName(), this.getLastName(),
				"Surgeon", hours, this.getBaseRate(), this.getConsultationFee(), (hours * this.getBaseRate() + this.getConsultationFee()));

	}

}
