public class LancandoExceptions {
	
    public static void main(String[] args) {
        System.out.println("Ini do main");
        
        try {
            metodo1();
        }
        catch (ArithmeticException | NullPointerException ex) {
        	ex.printStackTrace();
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
        
//        ClasseVazia nulo = new ClasseVazia(); 	// instancia um objeto vazio
//		  throw nulo;								// nao é possivel lancar objetos. Somente exceptions
        
//        ArithmeticException ex = new ArithmeticException("erro"); 	// instancia uma excessao
//        throw ex;										       			// lanca a excessao
        
        throw new ArithmeticException("erro");		// pode ser escrito dessa forma
            
//        System.out.println("Fim do metodo2"); 	// lancando a excessao, o que vem depois nem compila
    }
}





