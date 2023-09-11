package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;
	
	public Company() {
	}
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		double tax = 0.0;
		if (numberOfEmployees > 10) {
			
			tax = anualIncome * 14 / 100;
		} else {
			tax = anualIncome * 16 / 100;
		}
		return tax;
	}

}
