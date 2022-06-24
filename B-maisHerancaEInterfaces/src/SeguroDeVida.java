
public class SeguroDeVida implements ObjetoTributavel {
	
	CalculadorDeImpostos calculador;	
	
	public SeguroDeVida(double valor) {
		this.calculador = new CalculadorDeImpostos();
	}

	@Override
	public double calculaImposto(double valor, double taxa) {
		return this.calculador.calculaImposto(valor, taxa);
	}

	@Override
	public void setValor(double valor) {
		this.calculador.setValor(valor);;
	}
}
