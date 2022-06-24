public class TratandoTodasExcessoes {
	
    public static void main(String[] args) {
        System.out.println("Ini do main");
        
        try {
            metodo1();
        }
//        catch (ArithmeticException | NullPointerException | MinhaExcessao ex) {
//        			ex.printStackTrace();		
//        }
        catch (Throwable ex) {				// como todas as excessoes sao filhas da superclasse
        	ex.printStackTrace();			// Throwable, como o polimorfismo podemos capturar
        									// todas as exceptions
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
        
        throw new MinhaExcessao("erro da minha excessao");
//        throw new ArithmeticException("erro da excessao aritmetica");
//        throw new NullPointerException("erro de exessao de apontador para objeto nulo");
            
    }
}

