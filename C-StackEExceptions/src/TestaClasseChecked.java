
public class TestaClasseChecked {
	
	/*
	 * 	SE PODE INDICAR QUE O METODO PODE LANCAR EXCESSOES REALIZANDO O try/catch
	 *  OU ASSINANDDO NO METODO QUE ESTE throws Exception 
	 */

	public static void main(String[] args) {
		
		ClasseTesteChecked teste = new ClasseTesteChecked();
		
		try {
			teste.fazAlgo();							
		}												// OU SE FAZ O TRY/CATCH PARA TRATAR A 	
		catch (Throwable e) {							// EXCESSAO CHECKED (IDENTIFICADAS PELO
			System.out.println("tratando excessao");	// COMPILADOR)
			e.printStackTrace();
		
		}
		System.out.println("Tratando excessoes com try/catch");
	}
	
	
//	public static void main(String[] args) throws Throwable {
//		
//		ClasseTesteChecked teste = new ClasseTesteChecked();
//		
//		teste.fazAlgo();
//		
//		System.out.println("Tratando excessoes indicando que o metodo lanca excessoes");
//
//	}
	
}
