public class Programa{
	public static void main(String[] args){
	
		System.out.println();
		System.out.println();
		
		String idadeDigitada = args[0];
		System.out.println("A idade é " + idadeDigitada);
		int idade = Integer.parseInt(idadeDigitada);
		System.out.println("A idade como inteiro é " + idade);
		
		System.out.println();
		System.out.println();

		if (idade <18){
			System.out.println("pode entrar acompanhado");
		}else if (idade>=18 && idade <=60){
			System.out.println("pode entrar");
		}else{	
			System.out.println("não pode entrar");
			
		}
		
	}
}







