public class TryCatch {
	

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            
            try {											// tenta executar o codigo
                int a = i / 0;					// codigo potencialmente suscetivel a erro 		
            }
            catch (ArithmeticException ex) {				// se nao conseguir captura a
				System.out.println("ArithmeticException");	// Excessao
			}
        }
        System.out.println("Fim do metodo2");
    }
}


/*
 * 				RESULTADO NO CONSOLE
 * 
 * Ini do main
Ini do metodo1
Ini do metodo2
1
ArithmeticException			>> COM O TRATAMENTO DO ERRO O RESTANTE DO STACK É REALIZADO
2
ArithmeticException
3
ArithmeticException
4
ArithmeticException
5
ArithmeticException
Fim do metodo2
Fim do metodo1
Fim do main

 */

