
public interface ObjetoTributavel {

	void setValor(double valor);
	double calculaImposto(double valor, double taxa);
	
}

// como numa interface tudo � public e abstract e utilizacao desses
// no comeco dos metodos � opcional