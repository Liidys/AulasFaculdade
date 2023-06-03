package pp;

public class PessoaFisica extends Contribuinte {

	private double gastoComSaude;

	public PessoaFisica() {
		super();

	}

	public PessoaFisica(String name, double rendaAnual, double gastoComSaude) {
		super(name, rendaAnual);
		this.gastoComSaude = gastoComSaude;

	}

	public double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}

	public double imposto() {
		double taxaBasica;
		
		if (getRendaAnual() < 20000) {
			taxaBasica = getRendaAnual() * 0.15;
		} else {
			taxaBasica = getRendaAnual() * 0.25;
		}
		taxaBasica = taxaBasica - (getRendaAnual() * 0.5);
		if (taxaBasica < 0.0) {
			taxaBasica = 0.0;
		}
		return taxaBasica;
	}

}
