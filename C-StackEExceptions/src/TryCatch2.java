public class TryCatch2 {
	
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        
        try {
            metodo2();
        }
        catch (ArithmeticException ex) {				// se nao conseguir captura a
			System.out.println("ArithmeticException");	// Excessao
		}
        
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0;
        }
            
        System.out.println("Fim do metodo2");
    }
}

/*
 * 			RESULTADO NO CONSOLE
 * 
 * 	Ini do main
	Ini do metodo1
	Ini do metodo2				>> COM O try/catch NO INICIO DO METODO1, AO EXECUTAR O METODO2
	1							>> A EXCEPTION SERA LANCADA NO CORPO DO METODO2. COMO ESSE METODO
	ArithmeticException			>> NAO POSSUI TRATAMENTO PARA A EXCESSAO ELE É DESCARTADO DO STACK.
	Fim do metodo1				>> O FLUXO DO STACK RETORNA PARA O METODO1 QUE POSSUI O TRATAMENTO
	Fim do main					>> PARA A EXCEPTION. DESSA FORMA O RESTO DO STACK OCORRE NORMALMENTE
 * 
 */



