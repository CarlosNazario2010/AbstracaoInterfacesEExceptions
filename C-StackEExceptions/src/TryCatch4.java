public class TryCatch4 {
	

    public static void main(String[] args) {
        System.out.println("Ini do main");
        
        try {
            metodo1();
        }
//        catch (ArithmeticException ex) {
//			ex.printStackTrace();
//		}
//        catch (NullPointerException ex) {
//			ex.printStackTrace();
        
        	// ou pode ser escrito nesta sintaxe >>
        
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
        
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            
            // int a = i / 0;		  	// divisao por zero
            ClasseVazia cv = null; 		// instancia de um objeto nula	
            cv.metodoVazio();  	 		// executa um metodo vazio
        }  
        System.out.println("Fim do metodo2");
    }
}





