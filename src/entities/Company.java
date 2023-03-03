package entities;

public class Company extends TaxPayer{
	
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncom, Integer numberOfEmployees) {
		super(name, anualIncom);
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
		if (this.getNumberOfEmployees() > 10) {
			return getAnualIncom()*0.14;
		}else {
			return getAnualIncom()*0.16;
			}		
	}

}
