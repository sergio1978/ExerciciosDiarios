package exercicios061016;

public class Treino {

	//construtor
	public Treino() {	
		System.out.println(exercicio2());
		
	}
	
	//declarar variaveis
	private void exercicio1() {
		
		int pontosleixoes = 45;
	    int pontosfeirense = 76;
	    int pontosporto = 33;
	    int pontosaves = 67;
	}

	//criar 1 array
	private int exercicio2() {
		int[] pontosfora = new int[]{45, 76, 33, 67};
		
		//mostrar no ecran
		System.out.println("o valor da posicao 3 eh: " + pontosfora[2]);
		
	//Com duas linhas de código, some todos os valores constantes no array para o inteiro soma
		
	int soma = 0;
	for(int i=0; i< pontosfora.length; i++)
	soma = soma + pontosfora[i];
	
	
//devolver a soma
	return soma;
	}
	
}
