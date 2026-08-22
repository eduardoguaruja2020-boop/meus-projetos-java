package rpg_de_turno;

import java.util.Scanner;
import java.util.Random;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		System.out.println("BEM VINDO À ARENA DE BATALHA!!!");
		System.out.print("Diga-me o seu nome, herói: ");
		String nome = sc.nextLine();
		Personagem heroi = new Personagem(nome, 100, 5);
		Personagem monstro = new Personagem("DRAGÃO", 100, 5);
		int danoExtra = 0;
		int danoAtk = 0;
		int vidaMonstro = 0;
		int danoExtraMonstro = 0;
		int danoAtkMonstro = 0;
		int vidaHeroi = 0;
		System.out.println("Lutadores:");
		System.out.println("[HERÓI] " + heroi.getNome() + "(HP: " + heroi.getPontosDeVida() + " | " + "Dano base: "
				+ heroi.getDanoBase());
		System.out.println("[MONSTRO] " + monstro.getNome() + "(HP: " + monstro.getPontosDeVida() + " | "
				+ "Dano base: " + monstro.getDanoBase());
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; monstro.getPontosDeVida() > 0 && heroi.getPontosDeVida() > 0; i++) {
			System.out.println("---TURNO " + (i + 1) + " ---");
			danoExtra = gerador.nextInt(6);
			danoAtk = heroi.getDanoBase() + danoExtra;
			vidaMonstro = monstro.getPontosDeVida() - danoAtk;
			monstro.setPontosDeVida(vidaMonstro);
			if(heroi.getPontosDeVida() > 0) {
			System.out.println(heroi.getNome() + " ataca o " + monstro.getNome() + " e causa " + danoAtk + " de dano!");
			System.out.println("(Dano base: " + heroi.getDanoBase() + " + " + danoExtra + " de dano extra)");
			System.out.println(monstro.getNome() + " está com " + vidaMonstro + " HP");

			}

			danoExtraMonstro = gerador.nextInt(6);
			danoAtkMonstro = monstro.getDanoBase() + danoExtraMonstro;
			vidaHeroi = heroi.getPontosDeVida() - danoAtkMonstro;
			heroi.setPontosDeVida(vidaHeroi);
			if (monstro.getPontosDeVida() > 0) {

				System.out.println(
						monstro.getNome() + " ataca o " + heroi.getNome() + " e causa " + danoAtkMonstro + " de dano!");
				System.out
						.println("(Dano base: " + monstro.getDanoBase() + " + " + danoExtraMonstro + " de dano extra)");
				System.out.println(heroi.getNome() + " está com " + vidaHeroi + " HP");
			}

		}
		if (heroi.getPontosDeVida() > 0) {
		    System.out.println("\n========================================");
		    System.out.println(monstro.getNome() + " PERDEU A BATALHA! ");
		    System.out.println(heroi.getNome() + " VENCEU COM " + heroi.getPontosDeVida() + " DE HP!!");
		    System.out.println("========================================");
		} else {
		    System.out.println("\n========================================");
		    System.out.println(heroi.getNome() + " PERDEU A BATALHA! ");
		    System.out.println(monstro.getNome() + " VENCEU COM " + monstro.getPontosDeVida() + " DE HP!!");
		    System.out.println("========================================");
		}
	}
}
