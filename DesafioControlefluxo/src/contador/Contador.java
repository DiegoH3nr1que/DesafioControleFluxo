package contador;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("digite o primeiro parametro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parametro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch(ParametrosInvalidosException e){
			System.err.println(e.getMessage());
			return;
		}
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if(parametroDois > parametroUm) {
			throw new ParametrosInvalidosException ("o primeiro parametro tem que ser maior que o segundo parametro");
		}
		for(int i= 0; i<=(parametroUm - parametroDois ); i++) {
			System.out.println("Imprimindo o número " +i);
		}
	
}
}
