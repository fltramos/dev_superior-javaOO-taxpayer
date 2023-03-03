package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anualIncom;
	
	public TaxPayer() {		
	}

	public TaxPayer(String name, Double anualIncom) {	
		this.name = name;
		this.anualIncom = anualIncom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncom() {
		return anualIncom;
	}

	public void setAnualIncom(Double anualIncom) {
		this.anualIncom = anualIncom;
	}
	
	public abstract Double tax();

}
