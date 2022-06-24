public class Exception {
	
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
            int a = i / 0;				// lancando um ArithimeticException
        }
        System.out.println("Fim do metodo2");
    }
}

/*						RESULTADO NO CONSOLE >>>
 * 
 * 	Ini do main					>> executa o main >> o metodo1 >> o metodo2 >>
	Ini do metodo1				>> comeca o loop for >> imprime o primeiro i >>
	Ini do metodo2						e lanca a excecao
	1
	Exception in thread "main" java.lang.ArithmeticException: / by zero 	>> exception
		at Exception.metodo2(Exception.java:20)							>> stack >> int a = i / 0;	
		at Exception.metodo1(Exception.java:12)							>> stack >> metodo2();
		at Exception.main(Exception.java:6)								>> stack >> metodo1();
 * 
 * 
 *  		A EXCESSAP ELIMINA O METODO DA PILHA. SE ALGUM METODO MAIS ABAIXO DA PILHA
 *  		CONSEGUIR TRATAR A EXCESSAO, O RESTANTE DO CODIGO VOLTA A FUNCIONAR
 */


