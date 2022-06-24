public class StackOverFlowError {
	

    public static void main(String[] args) {
        System.out.println("Ini do main");
        
        try {
            metodo1();
        }
        catch (ArithmeticException | NullPointerException | 
        		MinhaExcessao ex) {
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
        
        metodo2();			// metodo2 rodara em loop
            
        System.out.println("Fim do metodo2"); 	
    }
}

/*
 * 	Ini do metodo2
	Ini do metodo2
	Ini do metodo2
	Ini do metodo2
	Ini do metodo2
	Ini do metodo2
	.
	.
	.
	executa o metodo em loop repetidas vezes ate acabar que a pilha (stack) 
	atinja o limite. Dessa forma a pilha sobrecarrega e ocorre o Exception:
	
	Exception in thread "main" java.lang.StackOverflowError
		at java.base/java.nio.CharBuffer.wrap(CharBuffer.java:408)
		at java.base/sun.nio.cs.StreamEncoder.implWrite(StreamEncoder.java:281)
		at java.base/sun.nio.cs.StreamEncoder.write(StreamEncoder.java:132)
		at java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
		.
		.
		.
 */




