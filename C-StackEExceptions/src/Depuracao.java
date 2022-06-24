public class Depuracao {
	
	
	/*	Stack (pilha) de execucao no java >>>>
		
		inicia o main(..)  >>  metodo1  >>  metodo2 (executa o laco)  >>  termina o metodo2  >>     
		
		remove o metodo2 do stack  >>  termina o metodo1  >>  remove o metodo1 do stack >>
		
		termina o metodo main(..)  >> remove o metodo main(..) do stack  >>  zera a pilha(stack)
		
					
							CALL STACK (pilha de execucao)
		
       |            |		     |            |           |          |          |
	   |            |            |  metodo2   |           |          |          |
	   |            |  metodo1   |  metodo1   | metodo1   |          |          | 
	   |   MAIN(..) |   MAIN(..) |   MAIN(..) |  MAIN(..) | MAIN(..) |          |
	   |____________|____________|____________|___________|__________|__________|
			STACK	     STACK        STACk	      STACK      STACK	    STACK
			
			>>>>---------------------  TEMPO  ----------------->>>>
	*/

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
        }
        System.out.println("Fim do metodo2");
    }
}

/*	                              DEPURACAO
 * 
 * para realizar o debug devemos marcar um endpoint (duplo clique no numero da linha
 *  que se deseja por um endpoint. Ao inves de um Run Stack para rodar a aplicacao
 * 	deve ser dado um Debug Stack que ira parar a aplicacao no endpoint, Apartir dai,
 *  Step Over para pular para a proxima chamada ou Step Into para entrar dentro de 
 *   metodo
 *  Com isso podemos ver com calma as operacoes realizadas pela aplicacao
*/
