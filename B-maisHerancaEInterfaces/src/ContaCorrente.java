
public class ContaCorrente extends Conta implements ObjetoTributavel {
	
	CalculadorDeImpostos calculador;	

	public ContaCorrente(int agencia, int numero) {					
		super(agencia, numero);	
		this.calculador = new CalculadorDeImpostos();
	}
	
	@Override								
	public boolean saca(double valor) {											
		double valorASacar = valor + 1;			
		
		return super.saca(valorASacar);										
	}

	@Override
	public void deposita(double valor) {		
		super.saldo += valor;	
	}

	@Override
	public void setValor(double valor) {
		this.calculador.setValor(valor);	
	}

	@Override
	public double calculaImposto(double valor, double taxa) {
		return this.calculador.calculaImposto(valor, taxa);
	}
}
	