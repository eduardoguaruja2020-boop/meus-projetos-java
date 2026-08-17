import java.util.Scanner;

public class duracaoJogo {
	
	public static void main(String[]args) {
		
		int horaInicial, horaFinal, duracao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE A HORA INICIAL E A HORA FINAL DO JOGO:");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS");
		
		sc.close();
		
	}
}
