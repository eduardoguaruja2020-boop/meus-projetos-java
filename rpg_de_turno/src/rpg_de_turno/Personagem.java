package rpg_de_turno;

public class Personagem {
	private String nome;
	private int pontosDeVida;
	private int danoBase;

	public Personagem(String nome, int pontosDeVida, int danoBase) {
		this.nome = nome;
		this.pontosDeVida = pontosDeVida;
		this.danoBase = danoBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	public int getDanoBase() {
		return danoBase;
	}

	public void setDanoBase(int danoBase) {
		this.danoBase = danoBase;
	}

}
