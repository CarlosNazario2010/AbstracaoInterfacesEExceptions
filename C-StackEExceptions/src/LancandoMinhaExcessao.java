public class LancandoMinhaExcessao {
	
    public static void main(String[] args) {
        System.out.println("Ini do main");
        
        try {
            metodo1();
        }
        catch (ArithmeticException | NullPointerException | 
        		MinhaExcessao ex) {
        			ex.printStackTrace();		// adicionando MinhaExcessao para que possa
        										// ser capturada junto com as outras exceptions
        }		
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        throw new MinhaExcessao("erro da minha excessao");	// lancando a minha excessao	
            
//        System.out.println("Fim do metodo2"); 			// lancando a excessao, o que vem depois nem compila
    }
}





