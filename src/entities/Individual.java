package entities;

public class Individual extends TaxPayer{
	
	private Double healthExpenditures;
	
	public Individual() {		
	}

	public Individual(String name, Double anualIncom, Double healthExpenditures) {
		super(name, anualIncom);
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
		if (this.getAnualIncom() >= 20000.00) {
			return (getAnualIncom() * 0.25) - (getHealthExpenditures()* 0.5);
		}
		return (getAnualIncom() * 0.15 )- (getHealthExpenditures()* 0.5);
	}
	
	

}
