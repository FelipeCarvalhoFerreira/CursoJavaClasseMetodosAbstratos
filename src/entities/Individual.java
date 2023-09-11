package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
	}

	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public Double tax() {
		double tax = 0.0;
		if (anualIncome < 20000.00) {
			tax = (anualIncome * 15/100) - (healthExpenditures * 50/100);
			
		} else {
			tax = (anualIncome * 25/100) - (healthExpenditures * 50/100);
		}
		return tax;
	}
	
	

}
