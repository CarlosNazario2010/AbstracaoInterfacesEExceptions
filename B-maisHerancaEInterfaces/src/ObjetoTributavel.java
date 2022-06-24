
public interface ObjetoTributavel {

	void setValor(double valor);
	double calculaImposto(double valor, double taxa);
	
}

// como numa interface tudo é public e abstract e utilizacao desses
// no comeco dos metodos é opcional